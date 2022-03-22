package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 14:38
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class NetUser {
    private String userId;
    private String password;
    private String email;


    public NetUser(String userId, String password, String email) {
        this.userId = userId;
        this.password = password;
        if (email == null) {
            this.email = userId + "@gameschool.com";
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String display() {
        return "用户ID:" + userId + '\t' + "用户密码:" + password +'\t' + "邮箱地址:" + email;
    }
}
