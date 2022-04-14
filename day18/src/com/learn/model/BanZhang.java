package com.learn.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/31 10:14
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class BanZhang extends Student{
    public void dianMing() {
        System.out.println("班长" + getName() + "正在点名");
    }

    @Override
    public void talkSelf() {
        System.out.println("班长" + getName() + "正在自我介绍");
    }

}
