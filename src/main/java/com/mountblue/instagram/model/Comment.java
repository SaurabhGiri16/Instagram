package com.mountblue.instagram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="comments")
public class Comment {
    @Id
    private ObjectId id;
    private ObjectId postId;
    private String commentText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

//    @DBRef
//    private User user;
//    private String userName;
}
