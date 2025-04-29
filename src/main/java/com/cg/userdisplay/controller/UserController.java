package com.cg.userdisplay.controller;

import com.cg.userdisplay.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @GetMapping("/userCreation")
    public String showUserCreation(Model model) {
        model.addAttribute("user", new User());
        return "userCreation";
    }

    @PostMapping("/userCreation")
    public String handleUserCreation(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "updateDetails";
    }

    @PostMapping("/updateDetails")
    public String handleUpdateDetails(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "updateAddress";
    }

    @PostMapping("/updateAddress")
    public String handleUpdateAddress(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "displayDetails";
    }
}
