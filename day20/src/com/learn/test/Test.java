package com.learn.test;

import com.learn.model.Student;

import java.util.ArrayList;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/2 8:21
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList();
        arrayList.stream();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
                if (arrayList.get(j).getAge() > arrayList.get(j+1).getAge()) {
                    Student temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
            }
        }
    }
}
