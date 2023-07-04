package com.mountblue.instagram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String email;
    private String password;

    public Document toDocument() {
        Document document = new Document();
        document.append("username", username);
        document.append("email", email);
        document.append("password", password);
        return document;
    }

    public static User fromDocument(Document document) {
        String username = document.getString("username");
        String email = document.getString("email");
        String password = document.getString("password");
        return new User(username, email, password);
    }
}

