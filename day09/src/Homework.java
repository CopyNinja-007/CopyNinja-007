/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/18 7:56
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
import java.util.Scanner;
public class Homework{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        int ags = scanner.nextInt();
        if (ags>100||ags<0){
            System.out.println("对不起你输入的成绩错误");
        }else if(ags >= 90){
            System.out.println("你的成绩为非常牛逼");
        }else if(ags >= 80){
            System.out.println("你的成绩为有点牛逼");
        }else if (ags >= 70){
            System.out.println("你的成绩为一点牛逼");
        }else if (ags >= 60){
            System.out.println("你的成绩为还不错");
        }else if (ags >= 50){
            System.out.println("你的成绩为刚刚好");
        }else if (ags >= 40){
            System.out.println("你的成绩为垃圾");
        }
    }
}

