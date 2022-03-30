package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:38
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Orange extends Fruit{
    public Orange() {
    }

    public Orange(String shape) {
        super(shape);
    }

    @Override
    public void eat() {
        System.out.println(this.getShape() + "的桔子好酸");
    }
}
