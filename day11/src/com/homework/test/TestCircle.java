package com.homework.test;

import com.homework.entity.Circle;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 14:17
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestCircle {
    public static void main(String[] args) {
        double r = 5;
        Circle circle = new Circle(r);
        System.out.println("半径为"+r+"的⚪的面积为：" + circle.getArea());
        System.out.println("半径为"+r+"的⚪的周长为：" + circle.getPerimeter());

    }
}
