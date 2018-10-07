package com.sundy.beans.relation;

import com.sundy.beans.autowrite.Address;
import com.sundy.beans.autowrite.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 部分属性通过类型和名称配置bean
 */
public class Main {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-realtion.xml");
        Address address = (Address) ctx.getBean("address");
        Address address2 = (Address) ctx.getBean("address2");
        Person person = (Person) ctx.getBean("person");
        Person person2 = (Person) ctx.getBean("person2");
        System.out.println(address);
        System.out.println(address2);
        System.out.println(person);
        System.out.println(person2);
    }
}
