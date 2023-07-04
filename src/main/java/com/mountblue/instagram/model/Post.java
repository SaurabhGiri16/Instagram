package com.mountblue.instagram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private String caption;
    private String imageUrl;

    public Document toDocument() {
        Document document = new Document();
        document.append("caption", caption);
        document.append("imageUrl", imageUrl);
        return document;
    }

    public static Post fromDocument(Document document) {
        String caption = document.getString("caption");
        String imageUrl = document.getString("imageUrl");
        return new Post(caption, imageUrl);
    }
}

