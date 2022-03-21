package homework;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 14:53
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {


        double d = (double)5/3;
        System.out.println(d);

        float f = (float)5/3;
        System.out.println(f);

        BigDecimal bigDecimal = new BigDecimal(5);
        System.out.println(bigDecimal.divide(new BigDecimal(3),2,BigDecimal.ROUND_HALF_UP));
    }
}
