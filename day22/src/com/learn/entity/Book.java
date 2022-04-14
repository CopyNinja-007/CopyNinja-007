package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:44
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Book {
    private int id;
    private String name;
    private double price;
    private String author;
    private boolean isBorrowed;

    public Book() {
    }

    public Book(int id, String name, double price, String author, boolean isBorrowed) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {

        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
