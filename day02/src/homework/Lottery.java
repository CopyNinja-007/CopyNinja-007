package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 14:15
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Lottery {
    public static void main(String[] args) {
        //设置中奖号码
        int jackpotNum = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入彩票号码：");
        int lotteryNum = scanner.nextInt();
        if (lotteryNum == jackpotNum) {
            System.out.println("中奖了");
        }else
            System.out.println("没中");

    }
}
