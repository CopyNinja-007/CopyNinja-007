package com.learn.test;


import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        FileInputStream in = null;
//        FileOutputStream out = null;
        try {
            in = new FileInputStream("day26/src/com/learn/test/Test.java");
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len = in.read(bytes)) != -1) {
                System.out.println(new String(bytes,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
