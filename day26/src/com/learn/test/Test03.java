package com.learn.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("day26/src/com/learn/test/properties.properties");
        properties.load(fileReader);
        fileReader.close();
        System.out.println(properties.get("name"));
        System.out.println(properties.getProperty("password"));

    }

}