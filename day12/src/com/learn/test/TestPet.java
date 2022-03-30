package com.learn.test;

import com.learn.Dog;
import com.learn.Pet;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 9:30
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestPet {
    public static void main(String[] args) {
        Pet pet = new Dog("旺财",100,40,"雄性");
        System.out.println(pet);
    }

}
