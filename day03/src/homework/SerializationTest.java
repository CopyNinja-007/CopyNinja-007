package homework;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 14:22
 * @description:有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 * @modified By:
 * @version: 1.0.0
 */
public class SerializationTest {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal(0);
        BigDecimal fenZi = new BigDecimal(2);
        BigDecimal fenMu = new BigDecimal(1);
        int index = 0;
        while(index < 20) {
            //累加器，四舍五入保留两位小数
            sum = sum.add(fenZi.divide(fenMu,3,ROUND_HALF_UP) );
            //分子放入一个临时变量中
            int temp = fenZi.intValue();
            //下一轮的分数分子等于上一个分数分子与分母的和
            fenZi = fenZi.add(fenMu);
            //下一轮的分母等于上一个分数分子
            fenMu = new BigDecimal(temp);
            index++;
        }
        System.out.println(sum);
    }
}
