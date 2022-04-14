package com.homework.model;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
    static ArrayList<Person> list=new ArrayList();
    static Scanner sc=new Scanner(System.in);

public void addPerson(){
    Person person=new Person();
    System.out.println("请输入账号：");
    person.setAccountNum(sc.nextLine());
    System.out.println("请输入姓名：");
    person.setName(sc.nextLine());
    System.out.println("请输入性别：");
    person.setSex(sc.nextLine());
    list.add(person);
    System.out.println("添加用户成功！");
}

public void deletePerson(){
    System.out.println("请输入待删除用户编号");
    int index=findIndex();
    list.remove(index);

    }
public int findIndex() {
    String s = sc.nextLine();
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).getAccountNum().equals(s)) {
            return i;
        }
    }
    return -1;
}
public int findNameIndex(){
    String s = sc.nextLine();
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).getName().equals(s)) {
            return i;
        }
    }return -1;

    }
    public int findSexReIndex(){
        String s = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSex().equals(s)) {
                return i;
            }
        }return -1;
    }
public void fingPerson(){
    System.out.println("【1】按编号查询【2】按姓名查询【3】按性别查询");
    int index=Integer.parseInt(sc.nextLine());
    switch (index){
        case 1:
            System.out.println("请输入用户编号");
            int i=findIndex();
            System.out.println("按编号查询符合的用户信息:["+list.get(i).getAccountNum()+
                    "\t"+list.get(i).getName()+"\t"+list.get(i).getSex()+"]");
            showPerson();
            break;
        case 2:
            System.out.println("请输入用户姓名");
            int j=findNameIndex();
            System.out.println("按编号查询符合的用户信息:["+list.get(j).getAccountNum()+"\t"+
                    list.get(j).getName()+"\t"+list.get(j).getSex()+"]");
            showPerson();
            break;
        case 3:
            System.out.println("请输入用户性别");
            int k=findSexReIndex();
            System.out.println("按编号查询符合的用户信息:["+list.get(k).getAccountNum()+
                    "\t"+list.get(k).getName()+"\t"+list.get(k).getSex()+"]");
            showPerson();
            break;
        default:
            break;
    }
}
public void showPerson(){
    for (int i = 0; i < list.size(); i++) {
    System.out.println("当前系统所有用户信息:["+list.get(i).getAccountNum()+"\t"+
            list.get(i).getName()+"\t"+list.get(i).getSex()+"]");
}
}
}
