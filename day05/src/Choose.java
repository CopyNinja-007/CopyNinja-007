import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/11 10:49
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Choose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if(array[i] != array[min]) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }


        for (int i: array) {
            System.out.println(i);
        }
    }
}
