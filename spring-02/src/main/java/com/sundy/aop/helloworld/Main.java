package com.sundy.aop.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorImpl();

        arithmeticCalculator =
                new ArithmeticCalculatorLoggingProx(arithmeticCalculator).getLoggingProxy();

        int result = arithmeticCalculator.add(11, 12);
        System.out.println("result:" + result);

        result = arithmeticCalculator.div(21, 3);
        System.out.println("result:" + result);


    }

}
