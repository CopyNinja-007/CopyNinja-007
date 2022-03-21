package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 11:37
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question13 {
    public static void main(String[] args) {
        String[] nameArray = {"张三","李四","王二","麻子","花花"};
        int position = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要查找的名字：");
        String searchName = scanner.nextLine();
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].equals(searchName)) {
                position = i;
                break;
            }
        }
        System.out.println(position == -1 ? "没查找到该姓名" : "查找到该姓名所在下标，下标为" + position);
    }
}
