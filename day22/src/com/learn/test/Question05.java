package com.learn.test;

import com.learn.entity.AnimalCry;
import com.learn.entity.CanCry;
import com.learn.entity.Cat;
import com.learn.entity.Dog;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:43
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question05 {
    public static void main(String[] args) {
        CanCry canCry = new Dog();
        CanCry canCry1 = new Cat();
        AnimalCry an = new AnimalCry();
        an.makeCry(canCry);
        an.makeCry(canCry1);
    }
}
