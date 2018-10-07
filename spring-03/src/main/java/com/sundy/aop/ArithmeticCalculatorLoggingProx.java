package com.sundy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorLoggingProx {

    //要代理的对象
    private ArithmeticCalculator target;

    public ArithmeticCalculatorLoggingProx(ArithmeticCalculator target) {
        this.target = target;
    }

    public ArithmeticCalculator getLoggingProxy() {
        ArithmeticCalculator proxy = null;
        //代理对象由哪一个类加载器负责加载
        ClassLoader loader = target.getClass().getClassLoader();
        //代理对象的类型，即其中有哪些方法
        Class<?>[] interfaces = new Class[]{ArithmeticCalculator.class};
        //当调用代理对象其中的方法时，该执行的代码
        InvocationHandler handler = new InvocationHandler() {

            /**
             * proxy: 正在返回的那个代理对象， 一般情况下在invoke方法总都不使用该对象
             * method: 正在被调用的方法
             * args: 调用方法传入的参数
             *
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                //日志
                try {
                    //执行方法
                    //前置通知
                    result = method.invoke(target, args);
                    //返回通知，可以访问到方法的返回值

                } catch (Exception e) {
                    //异常通知，可以访问到方法出现的异常
                }
                //后置通知，因为方法可以发生异常，所以可能访问不到方法的返回值
                return result;

            }
        };
        proxy = (ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, handler);

        return proxy;

    }
}
