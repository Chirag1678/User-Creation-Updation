package com.cg.userdisplay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String city;
    private String country;
}
