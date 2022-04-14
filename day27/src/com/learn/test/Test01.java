package com.learn.test;

import com.learn.model.Student;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws Exception {
//        File outFile = new File("F:\\Java\\workspace\\day27\\src\\com\\learn\\model\\a.txt");
//        if (!outFile.exists()) {
//            System.out.println("该文件不存在");
//            return;
//        }
//        ObjectOutputStream out = null;
//        if (outFile.length() == 0) {
//            out = new ObjectOutputStream(new FileOutputStream(outFile,true));
//        }else {
//            out = new MyObjectOutputStream(new FileOutputStream(outFile,true));
//        }
//        Student student = new Student("张三",18,"男");
//        Student student1 = new Student("李四",18,"男");
//        Student student2 = new Student("王二",18,"男");
//        Student student3 = new Student("麻子",18,"男");
//        out.writeObject(student);
//        out.writeObject(student1);
//        out.writeObject(student2);
//        out.writeObject(student3);
//        out.flush();
//        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:\\Java\\workspace\\day27\\src\\com\\learn\\model\\a.txt"));
        try {
            while(true) {
                Object obj=in.readObject();
                Student student = (Student) obj;
            }
        } catch (EOFException e) {
            System.out.println("文件已读完");
        }
        in.close();
    }
}
