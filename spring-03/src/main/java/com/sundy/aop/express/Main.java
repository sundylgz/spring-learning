package com.sundy.aop.express;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-express.xml");
        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
        int result = arithmeticCalculator.add(11, 12);
        System.out.println("result:" + result);
        result = arithmeticCalculator.div(21, 1);
        System.out.println("result:" + result);
    }
}
