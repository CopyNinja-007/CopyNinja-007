package com.learn.test;

import com.learn.entity.Person;

public class Test03 {
    public static void main(String[] args) {
        Person person = new Person.Builder("张三","男",14)
                .favorite("吃东西")
                .favorite("玩游戏")
                .favorite("")
                .build();
        System.out.println(person);
    }
}
