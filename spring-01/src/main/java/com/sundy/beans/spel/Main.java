package com.sundy.beans.spel;

import com.sundy.beans.autowrite.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowrite.xml");
        com.sundy.beans.autowrite.Person person = (com.sundy.beans.autowrite.Person) ctx.getBean("person");
        com.sundy.beans.autowrite.Person person2 = (com.sundy.beans.autowrite.Person) ctx.getBean("person");
        com.sundy.beans.autowrite.Person person3 = (Person) ctx.getBean("person");
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);
    }
}
