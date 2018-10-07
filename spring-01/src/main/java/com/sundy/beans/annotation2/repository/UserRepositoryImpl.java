package com.sundy.beans.annotation2.repository;

import org.springframework.stereotype.Repository;

@Repository(value = "userRepository")
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void save() {
        System.out.println("UserRepository save...");
    }
}
