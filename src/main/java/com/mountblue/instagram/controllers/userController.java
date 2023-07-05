package com.mountblue.instagram.controllers;

import com.mountblue.instagram.model.User;
import com.mountblue.instagram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "create-account";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        if (userService.registerUser(user)) {
            return "login";
        }
        model.addAttribute("existingUser", "User Already Exists");
        return "create-account";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
}
