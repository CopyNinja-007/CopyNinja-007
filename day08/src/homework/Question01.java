package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/17 11:16
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question01 {
    static int i = 0;
    static String[][] shangPin = new String[2][3];
    static Scanner scanner = new Scanner(System.in);
    static String flag = "u";
    public static void main(String[] args) {
        System.out.println("------------------ 欢迎使用奶茶店模拟系统 ------------------");
        while("u".equalsIgnoreCase(flag)) {
            System.out.println("************************************************");
            System.out.println("1.添加商品信息");
            System.out.println("2.显示所有商品信息");
            System.out.println("3.根据序号查询对应的商品信息");
            System.out.println("其他键-退出系统");
            System.out.println("************************************************");
            System.out.println("请输入你想进行的操作");
            String index = scanner.nextLine();
            switch (index) {
                case "1":
                    flag = addTea();
                    break;
                case "2":
                    flag = showTea();
                    break;
                case "3":
                    flag = findTeaById();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    public static String findTeaById() {
        System.out.println("请输入需要查询的商品编号");
        String s = scanner.nextLine();
        for (int j = 0; j < shangPin.length; j++) {
            if (s.equals(shangPin[j][0])) {
                System.out.println("序号"+"\t"+"奶茶名称"+"\t"+"价格");
                System.out.print(shangPin[j][0] + "\t");
                System.out.print(shangPin[j][1] + "\t");
                System.out.println(shangPin[j][2]);
                break;
            }else {
                System.out.println("没有查找到该序号商品");
            }
        }

        System.out.println("输入u或U返回主界面");
        return scanner.nextLine();

    }

    public static String showTea() {
        System.out.println("序号"+"\t"+"奶茶名称"+"\t"+"价格");
        for (int j = 0; j < shangPin.length; j++) {
            for (int k = 0; k < shangPin[j].length; k++) {
                if (shangPin[j][k] == null) {
                    System.out.println("输入u或U返回主界面");
                    return scanner.nextLine();
                }
                System.out.print(shangPin[j][k]);
                if (k==shangPin[j].length-1) {
                    break;
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("输入u或U返回主界面");
        return scanner.nextLine();
    }

    public static String addTea() {
        if (i < shangPin.length) {
            System.out.println("请输入商品序号");
            shangPin[i][0] = scanner.nextLine();
            System.out.println("请输入商品名称");
            shangPin[i][1] = scanner.nextLine();
            System.out.println("请输入商品价格");
            shangPin[i][2] = scanner.nextLine() + "￥";
            i++;
            System.out.println("输入u或U返回主界面");
            return scanner.nextLine();

        }else {
            //数组扩容
            int oldLength = shangPin.length;
            shangPin = Arrays.copyOf(shangPin,(int)(shangPin.length*1.5));
            for (int i = oldLength; i < shangPin.length ; i++) {
                shangPin[i] = new String[3];
            }
            return addTea();
        }
    }

}

