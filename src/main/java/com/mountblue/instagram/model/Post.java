package com.mountblue.instagram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "posts")
public class Post {
    @Id
    @Indexed(unique = true)
    private ObjectId postId;
    private String caption;
    private byte[] content;
    private String fileType;
    private ArrayList<String> tagList;
    private ArrayList<String> likes;
    private String location;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void prePersist() {
        this.setCreatedAt(LocalDateTime.now().now());
        this.setUpdatedAt(LocalDateTime.now().now());
    }

}

