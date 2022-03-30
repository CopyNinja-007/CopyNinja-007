package com.learn.test;

import com.learn.Dog;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 8:39
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财",100,50,"哈士奇");
        System.out.println(dog.getHealth());
        System.out.println(dog);
    }
}
