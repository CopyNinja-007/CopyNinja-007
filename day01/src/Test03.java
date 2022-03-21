import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 9:21
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        int ge = num%10;
//        System.out.println(ge);
//        int shi = num/10%10;
//        System.out.println(shi);
//        int bai = num/100%10;
//        System.out.println(bai);
//        int qian = num/1000%10;
//        System.out.println(qian);
        for (;num>0; num /= 10){
            if(num > 9) {
                int result = num % 10;
                System.out.println(result);
            }else {
                System.out.println(num);
                break;
            }
        }

    }
}
