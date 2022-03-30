package com.learn.test;

import com.learn.Person;
import com.learn.Student;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 9:46
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestStudent {
    public static void main(String[] args) {
        Person person = new Student("张三",18,1001);
        person.move();
        person.eat();
        if (person instanceof Student) {
            Student student = (Student)person;
            student.learn();
            student.move();
            student.eat();
        }

    }
}
