package com.homework.test;


import com.homework.entity.Student;
import com.homework.entity.StudentComparator;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.sort(new StudentComparator());
        list.add(new Student("喜羊羊",22,99));
        list.add(new Student("美羊羊",12,31));
        list.add(new Student("沸羊羊",15,99));
        list.add(new Student("暖羊羊",22,100));
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}