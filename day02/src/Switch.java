import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 11:32
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入技能索引：q-射手的专注，w-万箭齐发，e-鹰击长空，r-魔法水晶箭");
        String skillIndex = scanner.next();
        //jdk7+开始支持String类型
        switch (skillIndex) {
            case "q":
                System.out.println("射手的专注");
                break;
            case "w":
                System.out.println("万箭齐发");
                break;
            case "e":
                System.out.println("鹰击长空");
                break;
            case "r":
                System.out.println("魔法水晶箭");
                break;
            default:
                System.out.println("没有该技能");
        }
    }
}
