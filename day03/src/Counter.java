import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 11:12
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Counter {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入任何一个数字：");
        int num = scanner.nextInt();
        for (int i = 0; i < num+1; i++) {
            sum += i;
        }
        System.out.println("1~" + num + "的值为：" + sum);

    }
}
