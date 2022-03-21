import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 11:08
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test06 {
    public static void main(String[] args) {
        Test06 test06 = new Test06();
        test06.search();
    }

    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入笔试成绩：");
        double scoreBi = scanner.nextDouble();
        System.out.println("请输入机试成绩：");
        double scoreJi = scanner.nextDouble();
        String result = scoreBi >= 60 && scoreJi >= 60 ? "是" : "否";
        System.out.println("笔试成绩：" + scoreBi + '\t' + "机试成绩："
                + scoreJi + '\t' + "是否通过：" + result);
        System.out.println("查询成功，请按任意键继续...");

    }

}
