import java.util.Random;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 11:06
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class NumGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num;
        int num2;
        num = random.nextInt(100) + 1;
        do {
            System.out.println("请输入一个数字：");
            num2 = scanner.nextInt();
            if (num2 > num) {
                System.out.println("输入的数字太大了");
            }else if (num2 < num) {
                System.out.println("输入的数字太小了");
            }else {
                System.out.println("恭喜你：猜中了");
                break;
            }
        }while(true);


    }
}
