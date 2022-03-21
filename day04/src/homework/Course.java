package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 16:17
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Course {
    public static void main(String[] args) {
        String name;
        double sum = 0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        name = scanner.nextLine();
        for (;i <= 5;i++) {
            System.out.print("请输入第"+ i +"门课程的成绩：");
            sum += scanner.nextDouble();
        }
        System.out.println("学生"+ name + "考试的平均成绩为" + sum/--i);
    }
}
