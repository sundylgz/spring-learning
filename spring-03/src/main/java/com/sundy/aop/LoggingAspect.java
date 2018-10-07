package com.sundy.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
    @Before("execution(public int com.sundy.aop.ArithmeticCalculatorImpl.*(int, int))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the method " + methodName + " begin with " + Arrays.asList(args));
    }

    //后置通知：在目标方法执行后（无论是否发生异常），执行通知

    //在后置通知中不能访问目标方法执行结果
    @After("execution(public int com.sundy.aop.ArithmeticCalculatorImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("after advice，the method " + methodName + " begin with " + Arrays.asList(args));
    }


    /**
     * 在方法正常结束受执行的代码
     * 返回通知是可以访问到方法的返回值的
     *
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "execution(* com.sundy.aop.ArithmeticCalculatorImpl.*(..))", returning = "result")
    public void afterReturnMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("after return，the method " + methodName + " end with " + Arrays.asList(args) + " end with " + result);
    }


    /**
     * 在方法出现异常时会执行的代码
     * 可以访问到异常对象，且可以指定在出现特定异常时执行通知代码
     *
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "execution(* com.sundy.aop.ArithmeticCalculatorImpl.*(..))", throwing = "e")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception e) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("after return，the method " + methodName + " end with " + Arrays.asList(args) + " exception with " + e);
    }


    /**
     * 环绕通知需要携带 ProceedingJoinPoint 类型的参数.
     * 环绕通知类似于动态代理的全过程: ProceedingJoinPoint 类型的参数可以决定是否执行目标方法.
     * 且环绕通知必须有返回值, 返回值即为目标方法的返回值
     */
    @Around(value = "execution(* com.sundy.aop.ArithmeticCalculatorImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pjd) {

        Object result = null;
        String methodName = pjd.getSignature().getName();

        try {
            //前置通知
            System.out.println("The method " + methodName + " begins with " + Arrays.asList(pjd.getArgs()));
            //执行目标方法
            result = pjd.proceed();
            //返回通知
            System.out.println("The method " + methodName + " ends with " + result);
        } catch (Throwable e) {
            //异常通知
            System.out.println("The method " + methodName + " occurs exception:" + e);
            throw new RuntimeException(e);
        }
        //后置通知
        System.out.println("The method " + methodName + " ends");

        return result;
    }
}
