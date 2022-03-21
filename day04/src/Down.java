/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 9:23
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Down {
    public static void main(String[] args) {
        //5.一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
        // 求它在   第10次落地时，共经过多少米？第10次反弹多高？
        double index = 0;
        double sum = 0;
        double ten = 0;
        for (double i = 100; i >= 0 && index != 10;index++) {
            sum += i;
            i/=2;
            if(index == 9) {
                ten = i;
                break;
            }else {
                sum += i;
            }
        }
        System.out.println("第十次落地时：" + sum);
        System.out.println("第十次反弹时" + ten);
    }
}
