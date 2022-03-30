package com.learn;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 10:39
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Car {
    public  double price;
    private String brand;

    public Car() {
    }

    public Car(double price, String brand) {
        this.price = price;
        this.brand = brand;
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

    public void run() {
        System.out.println("Car{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}');
    }
}
