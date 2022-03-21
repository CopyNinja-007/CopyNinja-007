package homework;

import java.util.*;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/14 14:23
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class FiveQuestion {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Map hashMap = new TreeMap<String,AgeAndScore>();
        int index = 1;
        System.out.println("书店管理系统>会员信息管理>新增客户信息");
        while(index == 1) {
            AgeAndScore ageAndScore = new AgeAndScore();
            System.out.println("请输入会员名：");
            String vipId = String.valueOf(SCANNER.nextInt());
            System.out.println("请输入年龄");
            ageAndScore.setAge(SCANNER.nextInt());
            System.out.println("请输入积分");
            ageAndScore.setScore(SCANNER.nextLong());
            hashMap.put(vipId,ageAndScore);
            System.out.println("输入0键结束...");
            index = SCANNER.nextInt();
        }

        System.out.println("书店管理系统>会员信息管理>显示客户信息");
        System.out.println("会员号" + "\t" + "年龄" + "\t" + "积分");
        Set<Map.Entry<String,AgeAndScore>> set = hashMap.entrySet();
        for (Map.Entry<String,AgeAndScore> i  : set){
            System.out.print(i.getKey());
            System.out.print("\t");
            System.out.print(i.getValue().getAge());
            System.out.print("\t" + "\t");
            System.out.println(i.getValue().getScore());
        }

    }
}

class AgeAndScore{
    private int age;
    private long score;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public AgeAndScore() {
    }

    public AgeAndScore(int age, long score) {
        this.age = age;
        this.score = score;
    }

}