package com.learn.entity;

import java.util.Objects;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/4 9:15
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Car implements Comparable<Car>{
    private String carId;
    private String brand;
    private double price;

    public Car() {
    }

    public Car(String carId, String brand, double price) {
        this.carId = carId;
        this.brand = brand;
        this.price = price;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(carId, car.carId) &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, brand, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        int i = this.carId.compareTo(o.carId);
        if (i == 0) {
            return (int)(this.price - o.price);
        }
        return i;
    }
}
