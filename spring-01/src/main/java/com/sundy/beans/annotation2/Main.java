package com.sundy.beans.annotation2;

import com.sundy.beans.annotation2.controller.UserController;
import com.sundy.beans.annotation2.repository.UserRepository;
import com.sundy.beans.annotation2.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation2.xml");
        UserController userController = (UserController) ctx.getBean("userController");
        userController.execute();
    }
}
