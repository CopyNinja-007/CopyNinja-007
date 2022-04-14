package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:24
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Resume {
    private String name;
    private String sex;
    private int age;
    private String addr;
    private String educatie;

    public Resume() {
    }

    public Resume(String name, String sex, int age, String addr, String educatie) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.addr = addr;
        this.educatie = educatie;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEducatie() {
        return educatie;
    }

    public void setEducatie(String educatie) {
        this.educatie = educatie;
    }
    public String printResume() {
        return "大家好我是" + name + ", sex=" + sex + ", age=" + age + ", addr=" + addr + ", educatie=" + educatie;
    }
}
