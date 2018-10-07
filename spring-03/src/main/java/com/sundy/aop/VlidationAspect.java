package com.sundy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * 可以使用@Order 注解指定切面优先级，值越小优先级越高
 */
@Order(1)
@Aspect
@Component
public class VlidationAspect {

    @Before("execution(public int com.sundy.aop.ArithmeticCalculatorImpl.*(int, int))")
    public void validateArgs(JoinPoint joinPoint) {
        System.out.println("-->validate:" + Arrays.asList(joinPoint.getArgs()));
    }

}