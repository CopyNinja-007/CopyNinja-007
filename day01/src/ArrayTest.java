import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 17:09
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        int index = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("请输入一个整数(输入0结束)");
            i = scanner.nextInt();
            if(i != 0) {
                array[index++] = i;
            }

        } while(i != 0);

        Arrays.sort(array);
        System.out.println("最大值是" + array[array.length - 1]);
        int j = 0;
        while(array[j++] == 0) {

        }
        System.out.println("最小值是" + array[j]);
    }
}
