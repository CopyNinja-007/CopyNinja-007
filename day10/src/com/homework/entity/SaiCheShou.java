package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 13:58
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class SaiCheShou {
    private String name;
    private String number;
    private Saiche saiche;

    public SaiCheShou() {
    }

    public SaiCheShou(String name, String number, Saiche saiche) {
        this.name = name;
        this.number = number;
        this.saiche = saiche;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Saiche getSaiche() {
        return saiche;
    }

    public void setSaiche(Saiche saiche) {
        this.saiche = saiche;
    }

    public void drive() {

        System.out.print(getName()+"正在驾驶");
        saiche.speedUp();
    }

    public void stopDrive() {
        System.out.print(getName()+"正在驾驶");
        saiche.speedDown();
    }
}
