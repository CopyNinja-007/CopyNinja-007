package com.homework.test;


import com.homework.model.PersonList;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        PersonList personList=new PersonList();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while (flag) {

            System.out.println("请执行操作/【1】添加【2】删除【3】查询");
            int type=Integer.parseInt(sc.nextLine());
            switch (type){
                case 1:
                     personList.addPerson();
                    break;
                case 2:
                     personList.deletePerson();
                    break;
                case 3:
                    personList.fingPerson();
                    break;
                default:
                    flag=false;
        }
        }
    }
}
