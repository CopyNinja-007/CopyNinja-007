import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 8:46
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Login {
    public static void main(String[] args) {
        String userName;
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用登录系统！");
        System.out.println("请输入您的账号和密码：");
        System.out.print("账号：");
        userName = scanner.next();
        System.out.print("密码：");
        password = scanner.next();
        while(!("张三".equals(userName) && "123".equals(password))) {
            System.out.println("用户名或密码错误！请重新输入您的账号和密码：");
            System.out.print("账号：");
            userName = scanner.next();
            System.out.print("密码：");
            password = scanner.next();
        }
        System.out.println("登录成功！");
    }
}
