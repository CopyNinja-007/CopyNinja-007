package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 11:19
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question10 {
    public static void main(String[] args) {
        String[] nameArray = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println("请输入第"+(i+1)+"个人的姓名：");
            nameArray[i] = scanner.nextLine();
        }
        for (int i = 0; i < nameArray.length; i++) {
            if ((i+1)%2 != 0) {
                System.out.println(nameArray[i]);
            }
        }
    }
}
