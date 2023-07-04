package com.mountblue.instagram.repository;

import com.mountblue.instagram.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, Integer> {
}
