import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 10:12
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        for (;b;) {
            System.out.println("请输入账号：");
            String userName = scanner.nextLine();
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            if ("admin".equals(userName) && "123".equals(password)){
                System.out.println("欢迎用户"+ userName + "登录成功！");
                b=false;
            }else {
                System.out.println("登录失败，请重新登录！");
            }
        }
    }
}
