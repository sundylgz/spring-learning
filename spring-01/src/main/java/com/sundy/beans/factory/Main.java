package com.sundy.beans.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println("获得bean" + car);
        //关闭容器
        ctx.close();
    }
}
