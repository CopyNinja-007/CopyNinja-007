package com.homework.test;

public class Test01 {
    public static void main(String[] args) {
        String s = "Hello World";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                stringBuilder.append((c+"").toLowerCase());
            }else {
                stringBuilder.append((c+"").toUpperCase());
            }
        }
        System.out.println(stringBuilder);
    }
}
