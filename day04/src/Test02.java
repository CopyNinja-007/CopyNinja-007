

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 10:42
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flag;
        do {
            System.out.println("请输入一个整数：");
            int i = Integer.parseInt(scanner.nextLine());
            if (i%2 == 0) {
                System.out.println(i + "是偶数");

            }else{
                System.out.println(i + "是奇数");

            }
            System.out.println("请输入是否继续，Y或者y继续");
            scanner.nextLine();
            flag = scanner.nextLine();

        }while("y".equalsIgnoreCase(flag));
    }
}
