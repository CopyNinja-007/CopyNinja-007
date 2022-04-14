package com.homework.model;

public class Person {
    private String accountNum;
    private String name;
    private String sex;


    public Person() {
    }

    public Person(String accountNum, String name, String sex) {
        this.accountNum = accountNum;
        this.name = name;
        this.sex = sex;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
