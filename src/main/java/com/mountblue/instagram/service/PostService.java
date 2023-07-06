package com.mountblue.instagram.service;

import com.mountblue.instagram.model.Post;
import com.mountblue.instagram.repository.PostRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public boolean publishPost(Post post, MultipartFile[] file, String tags) throws IOException {
        List<byte[]> contents = new ArrayList<>();
        for(MultipartFile i : file){
            if(contents.size()==0){
                post.setFileType(i.getContentType());
            }
            contents.add(i.getBytes());
        }
          post.setContents(contents);
//        post.setFileType(file.getContentType());
//        post.setContent(file.getBytes());
        String[] tempArray = tags.split(" ");
        post.setTagList(Arrays.asList(tempArray));
        postRepository.save(post);
        return true;
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }


    public Post findFileByPostId(ObjectId id) {
        return postRepository.findByPostId(id);
    }
}
