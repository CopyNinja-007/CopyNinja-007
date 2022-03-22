package com.learn.test;


import com.learn.entity.StaticBlock;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 8:36
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    static {
        System.out.println(Test01.class + "类加载了");
    }
    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
        new StaticBlock();
    }

}
