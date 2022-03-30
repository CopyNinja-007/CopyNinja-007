package com.learn.model;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/29 9:47
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class MyArrays {
    static Car[] cars = new Car[50];
    static {
        cars[0] = new Bus(1111111,200000,"比亚迪-A");
        cars[1] = new Bus(111231,300000,"比亚迪-B");
        cars[2] = new Bus(11577111,400000,"比亚迪-C");
    }
    static int count;
    public static void sort() {
        for (int i = 0; i < cars.length-1; i++) {
            for (int j = 0; j < cars.length-1-i; j++) {
                if (cars[j+1] == null) {
                    break;
                }
                if (cars[j].getPrice() < cars[j+1].getPrice()) {
                    Car temp = cars[j];
                    cars[j] = cars[j+1];
                    cars[j+1] = temp;
                }
            }
        }
    }

    public static void allFind() {
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            count++;
            System.out.println(car);
        }
    }

    public static void addCar() {

    }

}
