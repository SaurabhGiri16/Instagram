package com.mountblue.instagram.controllers;

import com.mountblue.instagram.model.Post;
import com.mountblue.instagram.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class postController {

    @Autowired
    private PostService postService;

    @PostMapping("/publish-post")
    public String publishPost(@RequestParam("file") MultipartFile file , @ModelAttribute Post post, @RequestParam("tags") String tags) throws IOException {
        System.out.println(post);
        System.out.println(tags);
        System.out.println(file);
        postService.publishPost(post, file, tags);
    return "profile";
    }
}
