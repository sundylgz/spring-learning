package com.sundy.beans.cycle;

public class Car {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car() {

    }


    public void init() {
        System.out.println(" init...");
    }

    public void destory() {
        System.out.println("destory...");
    }
}
