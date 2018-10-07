package com.sundy.beans.factory;

import java.util.HashMap;
import java.util.Map;


/**
 * 实例工厂方法：实例工厂方法。即现需要创建工厂本身，再调用工厂的实例方法来返回bean的实例
 */
public class InstanceCarFactory {


    private Map<String, Car> cars = null;


    public InstanceCarFactory() {
        cars = new HashMap<>();
        cars.put("BMW", new Car("BMW", 10000));
        cars.put("bb", new Car("bb", 88));
    }


    public Car getCar(String brand) {
        return cars.get(brand);
    }
}
