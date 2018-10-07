package com.sundy.beans.autowrite;

import com.sundy.beans.collections.NewPerson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 部分属性通过类型和名称配置bean
 */
public class Main {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowrite.xml");
        Person person = (Person) ctx.getBean("person");
        Person person2 = (Person) ctx.getBean("person");
        Person person3 = (Person) ctx.getBean("person");
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);
    }
}
