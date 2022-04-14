package com.learn.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/31 10:14
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ZuZhang extends Student{

    public void fuDao() {
        System.out.println("组长" + getName() + "会辅导组员");
    }

    @Override
    public void talkSelf() {
        System.out.println("我是组长" + getName());
    }
}
