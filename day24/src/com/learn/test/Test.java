package com.learn.test;

import com.learn.entity.Student;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>((o1, o2) -> o1.age-o2.age);
        students.add(new Student("张三",18,"男"));
        students.add(new Student("张三",19,"男"));
        students.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        students.remove(new Student("李四",18,"男"));
        students.forEach(System.out::println);
    }
}
