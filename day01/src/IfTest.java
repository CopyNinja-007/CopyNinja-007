import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 15:36
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入今天的日期，星期一到星期天，1~7");
        int day = scanner.nextInt();
        System.out.println("请输入当天温度：");
        int wenDu = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入当天天气是否良好，如果好请输入“天气好”，如天气不好就请输入“天气不好”");
        String weather = scanner.nextLine();
        String s = "";
        //判断今天是否为星期天或者星期六，如是则外出
        if(day == 6 || day == 7) {
            //判断气温是否在30℃以上，如果是则去游泳
            if(wenDu > 30) {
                s = "去爬山";
            }else {
                s = "去游泳";
            }
            //如果今天不是周六或周日，就要工作
        } else if(day > 0 && day <= 7) {
            //如果天气好就要去客户单位谈业务
            if("天气好".equals(weather)) {
                s = "去客户单位谈业务";
            }else if ("天气不好".equals(weather)) {
                s = "在公司上网查资料";
            }else {
                s = "输入错误，请重新输入";
            }
        }
        System.out.println(s);
    }


}
