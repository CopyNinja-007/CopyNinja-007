package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 14:30
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestScore {
    public static void main(String[] args) {
        double score=0;
        Scanner scanner = new Scanner(System.in);
        do {
            if (score >= 0 && score <= 100) {
                System.out.println("请输入考试成绩：");
                score = scanner.nextDouble();
            }else {
                System.out.println("输入错误，请重新输入正确的成绩（0~100之间）！");
                score = scanner.nextDouble();
            }
        }while(score < 0 || score > 100);
        if (score == 100) {
            System.out.println("奖励一辆车");
        }else if (score >= 90){
            System.out.println("奖励一部MP4");
        }else if (score >= 60){
            System.out.println("奖励一本参考书");
        }else{
            System.out.println("什么都不买");
        }
    }
}
