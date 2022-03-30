package com.learn.test;

import com.learn.Car;
import com.learn.KaChe;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 10:45
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestKaChe {
    public static void main(String[] args) {
        Car car = new KaChe(800000,"大运汽车",5);
        car.run();
        if (car instanceof KaChe) {
            KaChe kaChe = (KaChe) car;
            kaChe.load();
        }
    }
}
