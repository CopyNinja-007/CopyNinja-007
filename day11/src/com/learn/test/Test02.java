package com.learn.test;

import com.learn.entity.XuanMing;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 10:16
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 120; i++) {
            new XuanMing(i+1 + "号先生").touPiaoMethod();
        }
    }
}
