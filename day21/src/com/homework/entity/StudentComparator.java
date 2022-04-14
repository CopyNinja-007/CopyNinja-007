package com.homework.entity;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int a=(int)(o1.getScore()-o2.getScore());
        if(a==0){
            return o1.getAge()-o2.getAge();
        }
        return a;
    }
}
