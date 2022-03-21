package homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 8:34
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class RandomTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入[0~10)的号码：");
        int i = scanner.nextInt();
        Random random = new Random();
        int jackPot = random.nextInt(10);
        if (i == jackPot) {
            System.out.print("您的号码为：" + i + '\t' + "您中奖了！" + '\t');
        }else {
            System.out.print("您的号码为：" + i + '\t' + "很遗憾您没有中奖!" + '\t');
        }
        System.out.println("中奖号码为：" + jackPot);
    }
}
