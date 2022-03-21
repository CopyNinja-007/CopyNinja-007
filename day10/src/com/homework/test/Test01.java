package com.homework.test;

import com.homework.entity.Student;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 13:26
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {
        Student student = new Student("张三",32,86);
        System.out.println(student.showMessage());
        student.jiangCheng();

    }
}
