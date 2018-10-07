package com.sundy.beans.factory;


import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回bean的实例
 */
public class StaticCarFactory {
    private static Map<String, Car> cars = new HashMap<>();


    static {
        cars.put("BMW", new Car("BMW", 10000));
        cars.put("bb", new Car("bb", 88));
    }


    //静态工厂方法

    public static Car getCar(String brand) {
        return cars.get(brand);
    }

}
