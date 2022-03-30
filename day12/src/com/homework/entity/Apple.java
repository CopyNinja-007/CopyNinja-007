package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:35
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Apple extends Fruit{
    public Apple() {
    }

    public Apple(String shape) {
        super(shape);
    }

    @Override
    public void eat() {
        System.out.println(this.getShape() + "的苹果好甜");
    }
}
