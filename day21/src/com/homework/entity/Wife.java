package com.homework.entity;

public class Wife {
    private String name;
    private int age;

    public Wife(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Wife() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void shopping(){
        System.out.println(getName() + "在买买买");
    }
}
