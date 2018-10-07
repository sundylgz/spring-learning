package com.sundy.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactorybean implements FactoryBean<Car> {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //返回bean对象
    @Override
    public Car getObject() throws Exception {
        return new Car(brand, 1000);
    }

    //返回bean类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
