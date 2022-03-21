package com.xieshaoliang.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 11:08
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Computer {
    private String cpu;
    private double price;
    private String ram;
    private String gpu;

    public Computer() {
    }

    public Computer(String cpu, double price, String ram, String gpu) {
        this.cpu = cpu;
        this.price = price;
        this.ram = ram;
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void watchMovie() {
        System.out.println("看电影");
    }

    public void playGames() {
        System.out.println("玩游戏");
    }
}
