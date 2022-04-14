package com.homework.model;

import java.util.Objects;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/1 11:33
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Card{
    private String huaSe;
    private String num;

    public Card() {
    }

    public Card(String huaSe, String num) {
        this.huaSe = huaSe;
        this.num = num;
    }

    public String getHuaSe() {
        return huaSe;
    }

    public void setHuaSe(String huaSe) {
        this.huaSe = huaSe;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return huaSe+num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return Objects.equals(getHuaSe(), card.getHuaSe()) &&
                Objects.equals(getNum(), card.getNum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHuaSe(), getNum());
    }

}
