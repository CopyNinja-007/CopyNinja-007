import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 11:27
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        double score = 0;
        String name = scanner.next();
        for (int i = 1; i <= 5; i++ ) {
            System.out.print("请输入5门功课中第" + i + "门课的成绩：");
            score += scanner.nextDouble();
        }
        System.out.println(name + "的平均分是：" + score);
    }
}
