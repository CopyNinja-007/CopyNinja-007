import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 10:41
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩！");
        double score = scanner.nextDouble();
        System.out.println(score >= 60 ? "及格" : "不及格");
    }
}
