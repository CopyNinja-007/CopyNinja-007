package com.homework.service;

import com.homework.model.Question;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionService {
    private static Scanner scanner = new Scanner(System.in);
    public static List<Question> questionList = new ArrayList<>();
    static {
        File file = new File("F:\\Java\\workspace\\day27\\src\\com\\homework\\service\\a.txt");
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String s;
            int index = 1;
            Question question = new Question();
            while((s=in.readLine()) != null) {
                switch (index) {
                    case 1:
                        question.setTitle(s);
                        break;
                    case 3:
                        question.setA(s);
                        break;
                    case 5:
                        question.setB(s);
                        break;
                    case 7:
                        question.setC(s);
                        break;
                    case 9:
                        question.setD(s);
                        break;
                    case 11:
                        question.setAnswer(s.charAt(0));
                        questionList.add(question);
                        question = new Question();
                        break;
                    case 14:
                        index = 0;
                        break;
                }
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void test() {
        for (int i = 0; i < questionList.size(); i++) {
            System.out.println(questionList.get(i).getTitle());
            System.out.println(questionList.get(i).getA());
            System.out.println(questionList.get(i).getB());
            System.out.println(questionList.get(i).getC());
            System.out.println(questionList.get(i).getD());
            System.out.print("请选择正确答案(p-上一题  n-下一题)：");
            String keyChar = scanner.nextLine();
            if ("p".equalsIgnoreCase(keyChar)) {
                if (i != 0) {
                    i-=2;
                    continue;
                }
                System.out.println("已经是第一题了");
                i--;
                continue;

            }else if ("n".equalsIgnoreCase(keyChar)) {
                if (questionList.size()-1 == i) {
                    System.out.println("已经是最后一题了");
                }
            }else if("f".equalsIgnoreCase(keyChar)) {
                System.out.print("确认是否结束考试(Y/N)：");
                String isExit = scanner.nextLine();
                if (isExit.length() != 0) {
                    if ("y".equalsIgnoreCase(isExit)) {
                        showTestScore();
                        return;
                    }else if ("n".equalsIgnoreCase(isExit)) {
                        i--;
                        continue;
                    }
                }else {
                    System.out.println("请输入单个字符");
                }
            } else if (keyChar.length() == 1){
                if ("a".equalsIgnoreCase(keyChar) || "b".equalsIgnoreCase(keyChar) || "c".equalsIgnoreCase(keyChar) || "d".equalsIgnoreCase(keyChar)) {
                    questionList.get(i).setMyAnswer(keyChar.charAt(0));
                }else {
                    System.out.println("请输入A-D或者n和p");
                    i--;
                    continue;
                }
            }else {
                System.out.println("请输入单个字符");
                i--;
                continue;
            }
            if (i == questionList.size()-1) {
                System.out.print("确认是否结束考试(Y/N)：");
                if ("y".equalsIgnoreCase(scanner.nextLine())) {
                    showTestScore();
                }else {
                    i--;
                    continue;
                }
            }

        }


    }
    public static void showTestScore() {
        System.out.println("序   号    标准答案    你的答案");
        double score = 0;
        for (int i = 0; i < questionList.size(); i++) {
            if (String.valueOf(questionList.get(i).getMyAnswer()).equalsIgnoreCase(String.valueOf(questionList.get(i).getAnswer()))){
                score+=10;
            }
            System.out.println("第 "+(i+1)+" 题       "+questionList.get(i).getAnswer()+"           "+String.valueOf(questionList.get(i).getMyAnswer()).toUpperCase());
        }
        System.out.println("恭喜，本次考试成绩为：" + score + " 分");
    }
}
