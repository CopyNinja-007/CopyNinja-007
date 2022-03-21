import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 8:20
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入成绩：");
        double score = scanner.nextDouble();
    }
}
