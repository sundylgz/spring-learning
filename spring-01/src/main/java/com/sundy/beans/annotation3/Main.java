package com.sundy.beans.annotation3;

import com.sundy.beans.annotation3.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 接口有多个实现可以通过添加bean名称直接(@Repository(value = "uerJdbcRepository")),
 * 还可以在注入的注解中添加@Qualifier(value = "userJdbcRepositoryImpl")
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation3.xml");
        UserController userController = (UserController) ctx.getBean("userController");
        userController.execute();
    }
}
