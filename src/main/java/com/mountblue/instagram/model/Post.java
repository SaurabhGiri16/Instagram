package com.mountblue.instagram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "posts")
public class Post {
    private String userName;
    private ArrayList<String> followers;
    private ArrayList<String> following;
    private ArrayList<String> tagList;
    private byte[] content;
    private String fileType;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

