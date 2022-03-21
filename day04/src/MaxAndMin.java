import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 10:05
 * @description:
 * @modified By:
 * @version: 1.0.0
 */

//4.循环接收一批整数，求出这些数中的最大值，及最小值 当输入数字0时结束时循环
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int max = 0;
        int min = 0;
        do {
            System.out.println("请输入一个数字：");
            num = scanner.nextInt();
            if (num > max) {
                max = num;
            }else if (num < min) {
                min = num;
            }
        }while(num != 0);

        System.out.println("max=" + (max == 0 ? "没有最大值" : max));
        System.out.println("min=" + (min == 0 ? "没有最小值" : min));

    }
}
