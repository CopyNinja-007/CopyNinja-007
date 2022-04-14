package com.learn.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties properties = new Properties();
       FileReader in = null;
        try {
            in = new FileReader("day28/src/com/learn/test/classPath.properties");
            properties.load(in);
            System.out.println(properties.getProperty("url"));
            System.out.println(properties.getProperty("username"));
            System.out.println(properties.getProperty("userpass"));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
