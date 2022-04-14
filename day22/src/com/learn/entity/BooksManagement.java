package com.learn.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:47
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class BooksManagement {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Book> bookList = new ArrayList<>();
    static {
        bookList.add(new Book(10001,"平凡的世界",38.8,"路遥",true));
        bookList.add(new Book(10002,"明朝那些事儿",28.8,"当年明月",false));
        bookList.add(new Book(10003,"天龙八部",68.88,"金鹰",false));
        bookList.add(new Book(10004,"三体",58.8,"刘慈欣",true));
        bookList.add(new Book(10005,"围城",31.8,"钱钟书",true));
        bookList.add(new Book(10006,"大秦帝国",36.8,"萧然",true));
    }
    public static void add() {
        System.out.println("----------添加图书----------");
        System.out.print("请输入图书id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("请输入图书名称:");
        String name = scanner.nextLine();
        System.out.print("请输入图书价格:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("请输入作者名称:");
        String author = scanner.nextLine();
        System.out.print("请输入是否借出(true/false):");
        boolean isBorrowed = Boolean.parseBoolean(scanner.nextLine());
        Book book = new Book(id,name,price,author,isBorrowed);
        bookList.add(book);
        System.out.println("----------添加成功!----------");
    }
    public static void deleteById() {
        System.out.println("----------删除图书----------");
        System.out.print("请输入需要删除的图书的Id:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Book book : bookList) {
            if (book.getId() == id) {
                bookList.remove(book);
                System.out.println("----------删除成功!----------");
                return;
            }

        }
        System.out.println("----------删除失败，不存在Id为" + id + "的书籍----------");
    }

    public static void showBooks() {
        System.out.println("----------查询全部书籍----------");
        bookList.forEach(System.out::println);
        System.out.println("----------查询完成----------");
    }
}
