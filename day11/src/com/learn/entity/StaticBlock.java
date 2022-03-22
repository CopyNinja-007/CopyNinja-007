package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 10:03
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class StaticBlock {
    static {
        System.out.println(StaticBlock.class + "静态代码块执行了");
    }


    {
        System.out.println("实列代码块执行了");
    }
}
