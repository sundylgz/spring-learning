package com.sundy.beans.scope;

import com.sundy.beans.autowrite.Address;
import com.sundy.beans.autowrite.Car;
import com.sundy.beans.autowrite.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 部分属性通过类型和名称配置bean
 */
public class Main {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
        Car car = (Car) ctx.getBean("car");
        Car car2 = (Car) ctx.getBean("car2");
        Car car3 = (Car) ctx.getBean("car2");
        Car car4 = (Car) ctx.getBean("car2");

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
