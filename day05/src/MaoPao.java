import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/11 9:33
 * @description:
 * @modified By:
 * @version: 1.0.0
 */

//冒泡，选择排序
public class MaoPao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("请输入5个数字：");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
