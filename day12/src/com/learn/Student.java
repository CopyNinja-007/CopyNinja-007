package com.learn;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 9:43
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Student extends Person{
    private int id;
    public Student() {
    }

    public Student(String name, int age,int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void learn() {
        System.out.println(getName() + "正在学习");
    }

    @Override
    public void eat() {
        System.out.println("子类的eat方法");
    }


    @Override
    public void move() {
        System.out.println("子类的move方法");
    }
}
