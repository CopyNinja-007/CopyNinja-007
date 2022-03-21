import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/14 9:12
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ShuLie {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = {8,4,2,1,23,344,12};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
        System.out.print("数列中所有的值为：");
        for(int i : array) {
            sum += i;
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println("数列的和：" + sum);
        for(int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                System.out.println("数列中包含该数字：" + num);
                break;
            } else if (i == array.length-1) {
                System.out.println("数列中不包含该数字：" + num);
            }
        }

    }
}
