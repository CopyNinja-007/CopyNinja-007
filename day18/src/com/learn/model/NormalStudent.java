package com.learn.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/31 10:49
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class NormalStudent extends Student {
    @Override
    public void talkSelf() {
        System.out.println("我是学生" + getName());
    }
}
