package com.learn;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 10:40
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class KaChe extends Car {
    private double load;

    public KaChe() {

    }

    public KaChe(double price, String brand, double load) {
        super(price, brand);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }
    public void load() {
        System.out.println(super.getBrand() + "载重为:" +getLoad());
    }
}
