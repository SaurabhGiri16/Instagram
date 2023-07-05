package com.mountblue.instagram.service;

import com.mountblue.instagram.model.User;
import com.mountblue.instagram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

     public boolean registerUser(User user){
        if(userRepository.findByUserName(user.getUserName())==null) {
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
