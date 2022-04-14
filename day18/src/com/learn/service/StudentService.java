package com.learn.service;

import com.learn.model.BanZhang;
import com.learn.model.Student;
import com.learn.model.ZuZhang;

import java.util.ArrayList;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/31 10:23
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class StudentService<A extends Student> {
    public  ArrayList<A> arrayList = new ArrayList();
    public void add(A t) {
        arrayList.add(t);
        System.out.println("添加成功");
    }
    public void showAll() {
        arrayList.forEach(System.out::println);
    }

    public void removeStudent(int no) {
        for (Student s : arrayList) {
            if (s.getNo() == no) {
                arrayList.remove(s);
                return;
            }
        }
        System.out.println("删除失败,没有该学生");
    }

    public void selectByNo(int no) {
        for (Student s: arrayList) {
            if (s.getNo() == no) {
                s.talkSelf();
                if (s instanceof ZuZhang) {
                    ((ZuZhang)s).fuDao();
                }else if (s instanceof BanZhang) {
                    ((BanZhang)s).dianMing();
                }
                return;
            }
        }
        System.out.println("查询失败,没有查找到该学生");
    }
}
