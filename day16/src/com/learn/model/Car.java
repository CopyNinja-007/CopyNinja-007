package com.learn.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/29 11:02
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public abstract class Car {
    private int carNo;
    private double price;
    private String brand;

    public Car() {
    }

    public Car(int carNo, double price, String brand) {
        this.carNo = carNo;
        this.price = price;
        this.brand = brand;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void start();

    public abstract double count();
}
