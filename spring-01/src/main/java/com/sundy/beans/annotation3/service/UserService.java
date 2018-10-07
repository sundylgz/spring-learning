package com.sundy.beans.annotation3.service;

import com.sundy.beans.annotation3.TestObject;
import com.sundy.beans.annotation3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    @Qualifier(value = "userJdbcRepositoryImpl")
    UserRepository uerJdbcRepository;


    //required = false bean可以为空
    @Autowired(required = false)
    TestObject testObject;

    public void add() {
        uerJdbcRepository.save();
        System.out.println("UserService add...");
    }
}
