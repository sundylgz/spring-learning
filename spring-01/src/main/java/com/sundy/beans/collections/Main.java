package com.sundy.beans.collections;

import com.sundy.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


        //ClassPathXmlApplicationContext: 是ApplicationContext接口的实现类。该实现类从类路径下来加载配置文件。
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从IOC容器中获取Bean实例
        // 利用id定位到IOC容器中的bean
        Person person7 = (Person) ctx.getBean("person7");
        Person person8 = (Person) ctx.getBean("person8");
        Person person9 = (Person) ctx.getBean("person9");
        Person person10 = (Person) ctx.getBean("person10");
        NewPerson newPerson = (NewPerson) ctx.getBean("newPerson");

        System.out.println(person7);
        System.out.println(person8);
        System.out.println(person9);
        System.out.println(person10);
        System.out.println(newPerson);
    }
}


