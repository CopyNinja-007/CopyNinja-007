package com.homework.test;

import com.homework.entity.NetUser;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 14:51
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestNetUser {
    public static void main(String[] args) {
        NetUser netUser = new NetUser("zhangsan","123456",null);
        System.out.println(netUser.display());
    }
}
