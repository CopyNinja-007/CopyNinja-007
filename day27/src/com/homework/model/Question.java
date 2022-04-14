package com.homework.model;

import java.io.Serializable;
import java.util.Objects;

public class Question {
    private String title;
    private String a;
    private String b;
    private String c;
    private String d;
    private char answer;
    private char myAnswer;

    public Question() {
    }

    public Question(String title, String a, String b, String c, String d, char answer, char myAnswer) {
        this.title = title;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.answer = answer;
        this.myAnswer = myAnswer;
    }

    public char getMyAnswer() {
        return myAnswer;
    }

    public void setMyAnswer(char myAnswer) {
        this.myAnswer = myAnswer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return getAnswer() == question.getAnswer() &&
                myAnswer == question.myAnswer &&
                Objects.equals(getTitle(), question.getTitle()) &&
                Objects.equals(getA(), question.getA()) &&
                Objects.equals(getB(), question.getB()) &&
                Objects.equals(getC(), question.getC()) &&
                Objects.equals(getD(), question.getD());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getA(), getB(), getC(), getD(), getAnswer(), myAnswer);
    }
}
