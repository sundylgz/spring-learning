package com.sundy.beans.annotation2.service;

import com.sundy.beans.annotation2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void add() {
        userRepository.save();
        System.out.println("UserService add...");
    }
}
