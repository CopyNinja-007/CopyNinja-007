package com.learn.test;

import com.learn.entity.Shape;
import com.learn.entity.Square;
import com.learn.entity.Triangle;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:37
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question04 {
    public static void main(String[] args) {
        Shape shape = new Square(4);
        System.out.println(shape.getArea());
        shape = new Triangle(3,4,5);
        System.out.println(shape.getArea());
    }
}
