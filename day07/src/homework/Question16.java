package homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 13:15
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question16 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int i = 0;
        //当数组array中数据插满之后结束while循环
        while(i < array.length) {
            //生成1-10的随机数，不能为0，因为int类型数组中的数据初始值为0
            int num = random.nextInt(10)+1;
            //判断是否存在，如果存在则跳过本次循环
            if(isExists(array,num) >= 0) {
                continue;
            }
            //把num的值赋给数组下标i，然后自加1
            array[i++] = num;
        }
        //对array数组进行排序
        Arrays.sort(array);
        for (int j = 0; j < array.length; j++) {
//            array[j] = array[j] - 1;
            System.out.println(--array[j]);
        }
    }
    //查询key值是否存在array中
    public static int isExists(int[] array,int key) {
        //把原先数组拷贝到新数组中
        int[] array2 = Arrays.copyOf(array,array.length);
        //进行排序
        Arrays.sort(array2);
        //查找key在数组中是否存在
        return Arrays.binarySearch(array2,key);
    }

}
