package com.homework.test;

import com.homework.entity.Person;
import com.homework.entity.Phone;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 14:34
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test03 {
    public static void main(String[] args) {
        Phone phone = new Phone("小米11",1999,"烟紫");
        Person person = new Person("李四",21,phone);
        person.call();
        person.eatRice();
        person.speak();
        person.playGames();
    }
}
