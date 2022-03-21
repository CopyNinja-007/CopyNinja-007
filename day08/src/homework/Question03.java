package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/17 14:15
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question03 {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        add(num1,num2);
        subtract(num1,num2);
        multiply(num1,num2);
        divide(num1,num2);
    }

    public static double add(double num1,double num2) {
        return num1 + num2;
    }

    public static double subtract(double jianShu,double beiJianShu) {
        return jianShu - beiJianShu;
    }

    public static double multiply(double num1,double num2) {
        return num1 * num2;
    }

    public static double divide(double beiChuShu,double chuShu) {
        return beiChuShu / chuShu;
    }



}
