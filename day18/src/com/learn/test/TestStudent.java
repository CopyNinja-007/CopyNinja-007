package com.learn.test;

import com.learn.exception.NotTrueRangeException;
import com.learn.model.BanZhang;
import com.learn.model.NormalStudent;
import com.learn.model.Student;
import com.learn.model.ZuZhang;
import com.learn.service.StudentService;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/31 10:22
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestStudent {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        StudentService<Student> studentStudentService = new StudentService<>();
        int num;

        do {
            System.out.println("欢迎使用学生管理系统");
            System.out.println("1.添加学生 2.显示学生 3.删除学生 4.查询学生");
            try {
                num = checkNum(1,4);
            } catch (RuntimeException e) {
                num=0;
                e.printStackTrace();
            }
        }while(num < 1 || num > 4);
        switch (num) {
            case 1:
                int num1 = studentType();
                Student student = new NormalStudent();
                switch (num1) {
                    case 2:
                        student = new BanZhang();
                        break;
                    case 3:
                        student = new ZuZhang();
                        break;
                }
                do {
                    try {
                        student = addStudent(student);
                        break;
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                } while (true);
                studentStudentService.add(student);
        }


    }

    private static Student addStudent(Student student)throws NumberFormatException {
        System.out.println("请输入学生姓名:");
        student.setName(scanner.nextLine());
        try {
            System.out.print("请输入学生学号:");
            student.setNo(Integer.parseInt(scanner.nextLine()));
            System.out.print("请输入学生年龄:");
            student.setAge(Integer.parseInt(scanner.nextLine()));
            return student;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("请输入整数型的学号或年龄");
        }
    }

    private static int studentType() {
        int num1;
        do {
            System.out.println("1.学生 2.班长 3.组长");
            try {
                num1 = checkNum(1,3);
            } catch (RuntimeException e) {
                num1 = 0;
                e.printStackTrace();
            }
        } while (num1 < 1 || num1 > 3);
        return num1;
    }

    public static int checkNum(int num1,int num2)throws RuntimeException {
        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < num1 || num > num2) {
                throw new NotTrueRangeException("请输入正确的范围["+num1+"~" + num2 + "]" + "之间");
            }
            return num;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("请输入整数类型");
        }
    }
}
