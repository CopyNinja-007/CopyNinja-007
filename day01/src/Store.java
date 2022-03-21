import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 14:34
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入基本工资:");
        //从键盘输入基本工资
        double salary = scanner.nextDouble();
        double wuJiaBuTie = salary * 0.4;
        double fangZuBuTie = salary * 0.2;
        double finallySalary = salary + fangZuBuTie + wuJiaBuTie;
        System.out.println("该员工的工资细目为");
        System.out.println("基本工资为：" + salary);
        System.out.println("物价津贴为：" + wuJiaBuTie);
        System.out.println("房租津贴为：" + fangZuBuTie);
        System.out.println("员工薪水为：" + finallySalary);
    }
}
