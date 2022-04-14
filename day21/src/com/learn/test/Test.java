package com.learn.test;

import com.learn.entity.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/4 7:57
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
 class Test {
    public static void main(String[] args) {
        Map<String, Car> map = new HashMap<>();
        Car car = new Car("湘A000001","比亚迪",2000000);
        Car car1 = new Car("湘A000002","比亚迪",3000000);
        Car car2 = new Car("湘A000003","比亚迪",4000000);
        Car car3 = new Car("湘A000004","比亚迪",5000000);
        Car car4 = new Car("湘A000005","比亚迪",6000000);
        map.put(car.getCarId(),car);
        map.put(car1.getCarId(),car1);
        map.put(car2.getCarId(),car2);
        map.put(car4.getCarId(),car4);
        map.put(car3.getCarId(),car3);
        Scanner scanner = new Scanner(System.in);
        String carId = scanner.nextLine();
        Car findCar = map.get(carId);
        if (findCar != null) {
            System.out.println(findCar);
        }else System.out.println("没找到该车牌号");

    }
}