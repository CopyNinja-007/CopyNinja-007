package com.homework.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/4 15:49
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question5 {
    public static void main(String[] args) {
        String[] province = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] city = {"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String,String> hashMap = new HashMap<>();
        for (int i = 0; i < province.length; i++) {
            hashMap.put(province[i],city[i]);
        }
        for (Map.Entry<String,String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
