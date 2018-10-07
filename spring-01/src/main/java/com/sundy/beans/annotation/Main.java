package com.sundy.beans.annotation;

import com.sundy.beans.annotation.controller.UserController;
import com.sundy.beans.annotation.repository.UserRepository;
import com.sundy.beans.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");


        TestObject testObject = (TestObject) ctx.getBean("testObject");
        System.out.println(testObject);


        UserController userController = (UserController) ctx.getBean("userController");
        System.out.println(userController);
        userController.execute();

        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService);
        userService.add();
        UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
        System.out.println(userRepository);
        userRepository.save();
    }
}
