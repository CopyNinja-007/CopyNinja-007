package com.learn.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/29 11:21
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class BigCar extends Car {
    public BigCar() {
    }

    public BigCar(int carNo, double price, String brand) {
        super(carNo, price, brand);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + "卡车启动了");
    }

    @Override
    public double count() {
        return getPrice()/365 + 150;
    }

    public void load() {
        System.out.println(getBrand() + "卡车装货");
    }
}
