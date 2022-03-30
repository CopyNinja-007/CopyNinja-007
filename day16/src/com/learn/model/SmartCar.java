package com.learn.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/29 11:18
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class SmartCar extends Car {
    public SmartCar() {
    }

    public SmartCar(int carNo, double price, String brand) {
        super(carNo, price, brand);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + "轿车启动了");
    }

    @Override
    public double count() {
        return getPrice()/365 + 100;
    }
}
