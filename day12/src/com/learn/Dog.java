package com.learn;

import java.io.Serializable;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 8:24
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Dog extends Pet{

    public Dog() {
    }

    public Dog(String name, int health, int love, String sex) {
        super(name, health, love, sex);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", health=" + getHealth() +
                ", love=" + getLove() +
                ", strain='" + getLove() + '\'' +
                '}';
    }
}
