package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:37
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Banana extends Fruit {
    public Banana() {
    }

    public Banana(String shape) {
        super(shape);
    }

    @Override
    public void eat() {
        System.out.println(this.getShape() + "的香蕉好香");
    }
}
