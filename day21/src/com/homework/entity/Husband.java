package com.homework.entity;

public class Husband {
    private String name;
    private int age;

    public Husband(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Husband() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void housework(){
        System.out.println(getName()+"做家务");
    }

    public void earnMoney(){
        System.out.println(getName()+"挣钱中");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
