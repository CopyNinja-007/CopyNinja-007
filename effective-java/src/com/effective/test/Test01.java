package com.effective.test;


public class Test01 {
    public static void main(String[] args) {
        String s = "hello";
        //禁止使用字符串与变量之间用加号拼接，会消耗大量的内存空间，采用StringBuffer或者StringBuilder
        String s1 = s + "world";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

    }
}
