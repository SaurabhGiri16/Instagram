package com.mountblue.instagram.repository;

import com.mountblue.instagram.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
