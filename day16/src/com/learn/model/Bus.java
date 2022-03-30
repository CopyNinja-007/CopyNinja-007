package com.learn.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/29 11:22
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Bus extends Car {
    public Bus() {
    }

    public Bus(int carNo, double price, String brand) {
        super(carNo, price, brand);
    }

    @Override
    public void start() {

    }

    @Override
    public double count() {
        return getPrice()/365 + 200;
    }

    public void bz() {
        System.out.println(getBrand() + "公交车报站");
    }
}
