package com.learn.model;

import java.util.Objects;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 8:17
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class User {
    private String userName;
    private int age;
    private String password;

    public User() {
    }

    public User(String userName, String password,int age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getPassword(), user.getPassword());
    }
}
