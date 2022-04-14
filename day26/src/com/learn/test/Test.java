package com.learn.test;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String path = "day26/src/com/learn/test";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        file = new File(file.getPath() + "/HelloWorld.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
