package com.mountblue.instagram.controllers;

import com.mountblue.instagram.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class postController {

    @PostMapping("/publish-post")
    public String publishPost(@ModelAttribute Post post){
        System.out.println(post);
    return "profile";
    }
}
