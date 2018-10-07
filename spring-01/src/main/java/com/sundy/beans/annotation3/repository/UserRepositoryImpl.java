package com.sundy.beans.annotation3.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void save() {
        System.out.println("UserRepository save...");
    }
}
