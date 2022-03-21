import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 10:42
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score = 0;
        do {
            if (score <= 100 && score >= 0) {
                System.out.println("请输入你的成绩：");
                score = scanner.nextDouble();
            }else {
                System.out.println("请重新输入你的成绩：");
                score = scanner.nextDouble();
            }
        } while(score > 100 || score < 0);


        if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("中等");

        }else if (score < 60) {
            System.out.println("差");
        }

    }
}
