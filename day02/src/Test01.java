import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 8:36
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入张浩的Java成绩：");
        double javaScore = scanner.nextDouble();
        System.out.println("输入张浩的音乐成绩：");
        double musicScore = scanner.nextDouble();
        if ((javaScore > 98 && musicScore > 80) || (javaScore == 100 && musicScore > 70)) {
            if (javaScore > 98) {
                System.out.println("老师说：不错，奖励个MP4！");
            } else {
                System.out.println("老师说：今天留下来写代码");
            }
        }
    }
}
