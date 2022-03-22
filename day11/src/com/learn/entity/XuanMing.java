package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 10:12
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class XuanMing {
    private String name;
    private boolean touPiao;
    public static int piaoCount;

    public XuanMing() {
    }

    public XuanMing(String name, boolean touPiao) {
        this.name = name;
        this.touPiao = touPiao;
    }

    public XuanMing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTouPiao() {
        return touPiao;
    }

    public void setTouPiao(boolean touPiao) {
        this.touPiao = touPiao;
    }

    public static int getPiaoCount() {
        return piaoCount;
    }

    public static void setPiaoCount(int piaoCount) {
        XuanMing.piaoCount = piaoCount;
    }

    public void touPiaoMethod() {
        if (touPiao) {
            System.out.println(getName() + "先生，你已经投过票了");
        }else if(XuanMing.piaoCount >= 100) {
            System.out.println("投票失败，票数已满");
        } else {
            XuanMing.piaoCount++;
            System.out.println(getName() + "先生，恭喜你投票成功");
            touPiao = true;
        }
    }
}
