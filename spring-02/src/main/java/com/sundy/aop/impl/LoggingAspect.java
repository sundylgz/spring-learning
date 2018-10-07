package com.sundy.aop.impl;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//把这个类声明为切面，
//需要把该类放入到IOC容器中、再声明为一个切面
//加入使 AspjectJ 注解(Before)起作用的配置: <aop:aspectj-autoproxy></aop:aspectj-autoproxy> 为匹配的类自动生成动态代理对象.
@Aspect
@Component
public class LoggingAspect {


    //声明该方法时一个前置通知：在目标方法开始之前执行
    //*表示所有方法 @Before("execution(public int com.sundy.aop.impl.ArithmeticCalculatorImpl.*(int, int))")
    //*表示任意修饰符任意返回值 @Before("execution(* int com.sundy.aop.impl.ArithmeticCalculatorImpl.add(int, int))")
    //第一个*表示包中所有类，第二个*表示包中的所有方法 @Before("execution(* int com.sundy.aop.impl.*.*(int, int))")
    //第一个*表示包中所有类，第二个*表示包中的所有方法,..参数任意 @Before("execution(* int com.sundy.aop.impl.*.*(..))")
    @Before("execution(public int com.sundy.aop.impl.ArithmeticCalculatorImpl.*(int, int))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the method " + methodName + " begin with " + Arrays.asList(args));
    }

    //后置通知：在目标方法执行后（无论是否发生异常），执行通知

    //在后置通知中不能访问目标方法执行结果
    @After("execution(public int com.sundy.aop.impl.ArithmeticCalculatorImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("after advice，the method " + methodName + " begin with " + Arrays.asList(args));
    }

}
