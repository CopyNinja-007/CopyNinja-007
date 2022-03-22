package com.homework.test;

import com.homework.entity.Person;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 14:07
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("张三",18);
        System.out.println(person1.display());
    }
}
