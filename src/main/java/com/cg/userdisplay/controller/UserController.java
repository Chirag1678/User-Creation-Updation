package com.cg.userdisplay.controller;

import com.cg.userdisplay.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @GetMapping("/userCreation")
    public String showUserCreation() {
        return "userCreation";
    }

    @PostMapping("/userCreation")
    public String handleUserCreation(@RequestParam String firstName,
                                     @RequestParam String lastName,
                                     Model model) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);

        model.addAttribute("user", user);
        return "redirect:/updateDetails";
    }

    @GetMapping("/updateDetails")
    public String showUpdateDetails(Model model, HttpSession session) {
        User user = (User) session.getAttribute("userInfo");
        model.addAttribute("user", user);
        return "updateDetails";
    }

    @PostMapping("/updateDetails")
    public String handleUpdateDetails(@RequestParam String firstName,
                                      @RequestParam String lastName,
                                      @RequestParam String email,
                                      @RequestParam String phone,
                                      Model model) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhone(phone);

        model.addAttribute("user", user);
        return "redirect:/updateAddress";
    }

    @GetMapping("/updateAddress")
    public String showUpdateAddress(Model model, HttpSession session) {
        User user = (User) session.getAttribute("userInfo");
        model.addAttribute("user", user);
        return "updateAddress";
    }

    @PostMapping("/updateAddress")
    public String handleUpdateAddress(@RequestParam String firstName,
                                      @RequestParam String lastName,
                                      @RequestParam String email,
                                      @RequestParam String phone,
                                      @RequestParam String city,
                                      @RequestParam String country,
                                      Model model) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhone(phone);
        user.setCity(city);
        user.setCountry(country);

        model.addAttribute("user", user);
        return "redirect:/displayDetails";
    }

    @GetMapping("/displayDetails")
    public String showDisplayDetails(Model model, HttpSession session) {
        User user = (User) session.getAttribute("userInfo");
        model.addAttribute("user", user);
        return "displayDetails";
    }
}
