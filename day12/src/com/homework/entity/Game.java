package com.homework.entity;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Random;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:40
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Game {
    public Fruit winning() {
        Random random = new Random();
        int index = random.nextInt(3);
        Fruit fruit = new Apple("圆圆的");
        if (index == 1) {
            fruit = new Banana("弯弯的");
        }else if (index == 2) {
            fruit = new Orange("长长的");
        }
        return fruit;
    }

}
