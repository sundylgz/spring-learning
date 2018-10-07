package com.sundy.beans.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * FactoryBean 通常是用来创建比较复杂的bean，一般的bean 直接用xml配置即可，
 * 但如果一个bean的创建过程中涉及到很多其他的bean 和复杂的逻辑，用xml配置比较困难，这时可以考虑用FactoryBean。
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factorybean.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println("获得bean" + car);
        //关闭容器
        ctx.close();
    }
}
