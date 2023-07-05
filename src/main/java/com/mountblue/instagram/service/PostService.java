package com.mountblue.instagram.service;

import com.mountblue.instagram.model.Post;
import com.mountblue.instagram.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public boolean publishPost(Post post, MultipartFile file, String tags) throws IOException {
        post.setFileType(file.getContentType());
        post.setContent(file.getBytes());
        String[] tempArray = tags.split(" ");
        post.setTagList(Arrays.asList(tempArray));
        postRepository.save(post);
        return true;
    }
}
