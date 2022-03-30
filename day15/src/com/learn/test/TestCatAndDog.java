package com.learn.test;

import com.learn.entity.Cat;
import com.learn.entity.Dog;
import com.learn.entity.Master;
import com.learn.entity.Pet;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/28 10:12
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestCatAndDog {
    public static void main(String[] args) {
        Pet pet = new Cat("咪咪",3,60,"布偶");
        Pet pet1 = new Dog("小黄",7,70,"小型");
        pet.action();
        pet1.action();
        Master master = new Master(pet);
        master.wei();
        master.liu();
    }
}
