package com.homework.test;

import com.homework.service.QuestionService;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------欢迎使用在线考试系统-------");
            System.out.println();
            System.out.println("          1 进入考试");
            System.out.println("          2 查看成绩");
            System.out.println("          3 系统退出");
            System.out.print("            请选择... ");
            int index = Integer.parseInt(scanner.nextLine());
            switch (index) {
                case 1:
                    System.out.println("-----------欢迎进入考试-----------");
                    System.out.println();
                    System.out.println("         使用以下按键进行考试:");
                    System.out.println();
                    System.out.println("         A-D：选择指定答案");
                    System.out.println("         P  ：显示上一题");
                    System.out.println("         N  ：显示下一题");
                    System.out.println("         F  ：结束考试");
                    System.out.print("         请按N键进入考试...");
                    String keyChar = scanner.nextLine();
                    if ("N".equalsIgnoreCase(keyChar)) {
                        QuestionService.test();
                    }
                    break;
                case 2:
                    QuestionService.showTestScore();
                    break;
                case 3:
                    flag = false;

            }
        } while (true);
    }
}
