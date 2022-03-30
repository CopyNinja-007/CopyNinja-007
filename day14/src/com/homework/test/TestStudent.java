package com.homework.test;

import com.homework.model.Student;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/25 15:38
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("张三",90);
        System.out.println("姓名:" + student.getName() + "\t" + "分数:" + student.getScore());
        student.setName("李四");
        student.setScore(40);
        System.out.println("姓名:" + student.getName() + "\t" + "分数:" + student.getScore());

    }
}
