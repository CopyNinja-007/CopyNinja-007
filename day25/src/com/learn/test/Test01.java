package com.learn.test;


import java.io.*;
import java.util.Objects;


public class Test01 {
    public static void main(String[] args){
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader(Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("com/learn/test/HelloWorld.txt")).getPath());
            out = new FileWriter("F:\\Java\\workspace\\day25\\src\\com\\learn\\test\\HelloWorld副本.txt",true);
            char[] chars = new char[1024*1024];
            int i;
            while((i = in.read(chars)) != -1) {
                out.write(chars,0,i);
            }
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

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
