package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 16:35
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入考试名次");
        int rankNum = scanner.nextInt();
        if (rankNum == 5) {
            System.out.println("奖励出去游玩一次");
        } else {
            System.out.println("什么都没有");
        }


    }
}
