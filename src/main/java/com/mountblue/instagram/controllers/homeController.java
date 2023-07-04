package com.mountblue.instagram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "create-account";
    }

    @PostMapping("/register")
    public String registerUser(){
        return "profile";
    }

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
}
