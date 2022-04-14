package com.learn.entity;

public class Foods {
    private String name;
    private double price;
    private double weight;
    private double shelfLife;

    public Foods() {
    }

    public Foods(String name, double price, double weight, double shelfLife) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.shelfLife = shelfLife;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(double shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return "Foods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", shelfLife=" + shelfLife +
                '}';
    }
}
