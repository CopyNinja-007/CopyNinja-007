package com.learn.test;

import com.learn.entity.Resume;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:23
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
//3：某公司正进行招聘工作，被招聘人员需要填写个人信息，编写"个人简历"(Resume)的封装类。 （10分）
public class Question03 {
    public static void main(String[] args) {
        Resume resume = new Resume("慕容云海","男", 17,"艾利斯顿商学院","本科");
        System.out.println(resume.printResume());
    }
}
