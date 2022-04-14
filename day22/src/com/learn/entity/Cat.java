package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:41
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Cat implements CanCry {
    @Override
    public void cry() {
        System.out.println("我是猫，我的叫声是喵喵喵");
    }
}
