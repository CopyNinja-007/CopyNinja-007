package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 11:06
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question07 {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = {25,24,12,76,101,96,28};
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i : array) {
            sum += i;
        }
        System.out.println("平均值为：" + (double)sum/array.length);
        System.out.println("最大值为：" + array[array.length-1]);
    }
}
