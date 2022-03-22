package com.homework.test;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 13:33
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
import com.homework.entity.Vehicle;
public class TestVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(40,8);
        vehicle.move();
        vehicle.speedUp(20);
        vehicle.speedDown(90);

    }
}
