package com.learn.test;

import java.io.File;
import java.util.LinkedList;

public class TreeView {
    static int level= 0;
    static LinkedList<String> linkedList = new LinkedList<>();
    public static void main(String[] args) {
        File file = new File("F:/java");
        treeMap(file);
        for (int i = linkedList.size()-1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }
    }

    public static void treeMap(File file) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("|   ");
        }
        sb.append("├─");
        if (file.isDirectory()) {
            sb.append(file.getName());
            level++;
            File[] files = file.listFiles();

            assert files != null;
            for (File element : files) {
                treeMap(element);
            }
            level--;

        }else {
            sb.append(file.getName());
        }

        linkedList.add(sb.toString());
    }
}
