/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 8:54
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test02 {
    public static void main(String[] args) {
        int num1 = 127;
        double num2 = 3.1415;
        float num3 = 2.1f;
        byte num4 = 127;
        char num5 = 97;
        // 小转大，自动类型转换；
        num2 = num1;
        System.out.println(num2);
        //大转小，需要强制类型转换，否则会报错，强制类型转换会产生数据不准确，精度丢失；
        num3 = (float) num2;
        System.out.println(num3);
        //整数类型和浮点型进行运算的结果数据类型不能为整数型,需要进行强制类型转换，否则会报错，强制类型转换会产生数据不准确，精度丢失；
        num1 = (int) (num4 * 3.1415);

        String s = "123";

        //字符串强制类型转换为基本数据类型,需要调用对应的包装类的解析方法；
        int num6 = Integer.parseInt(s) + 17;
        System.out.println(num6);



    }
}