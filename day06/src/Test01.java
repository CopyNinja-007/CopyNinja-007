import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/14 7:59
 * @description:
 * @modified By:
 * @version: 1.0.0
 */

public class Test01 {
    public static void main(String[] s) {
        int[] ages = new int[5];
        Scanner scanner = new Scanner(System.in);
        //给数组赋值
        for (int i = 0; i < ages.length; i++) {
            System.out.println("请输入年龄：");
            ages[i] = scanner.nextInt();
        }
//冒泡排序法
        for (int i = 0; i < ages.length - 1; i++) {
            for (int j = i + 1; j < ages.length; j++) {
                if (ages[i] > ages[j]) {
                    int temp = ages[j];
                    ages[j] = ages[i];
                    ages[i] = temp;
                }
            }
        }

        for (int i = 0; i < ages.length-1; i++) {
            for (int j = 0; j < ages.length-1-i; j++) {
                if (ages[j+1] < ages[j]) {
                    int temp = ages[j];
                    ages[j] = ages[i];
                    ages[i] = temp;
                }
            }
        }
//     选择排序法；
//        for (int i = 0; i < ages.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < ages.length; j++) {
//                if (ages[j] < ages[minIndex]) {
//                    minIndex = j;
//                }
//            }
//
//            if (minIndex!= i){
//              int temp = ages[minIndex];
//              ages[minIndex] = ages[i];
//              ages[i] = temp;
//             }
//        }

        //遍历数组
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

    }
}
