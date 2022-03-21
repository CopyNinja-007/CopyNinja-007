import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/17 8:17
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Sum {
    public static void main(String[] args) {

        System.out.println(max(2, 34, 22));
        System.out.println(max(34,22,2));
        System.out.println(max(22,2,34));

    }

    public static int sum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum+=i;
        }
        return sum;

    }

    public static int max(int num1,int num2,int num3) {
//        int[] array = new int[3];
//        array[0] = num1;
//        array[1] = num2;
//        array[2] = num3;
//        Arrays.sort(array);
//        return array[array.length-1];
        int max = num1;
        if (max < num2) {
            max = num2;
            if (max < num3) {
                max = num3;
            }
        }else if (max > num2){
            if (max < num3) {
                max = num3;
            }
        }
        return  max;
    }
}
