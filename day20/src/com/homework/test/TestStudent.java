package com.homework.test;

import com.homework.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/2 9:31
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"范冰冰",30));
        studentList.add(new Student(2,"李冰冰",35));
        studentList.add(new Student(3,"郭冰冰",18));
        System.out.println(studentList.get(1));
        studentList.get(2).setName("赵飞燕");
        System.out.println("==================================");
        System.out.println("==========所有学生信息=============");
        studentList.stream().forEach(Student::toString);
    }
}
