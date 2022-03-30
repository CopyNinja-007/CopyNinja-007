package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/28 10:45
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Master {
    private Pet pet;

    public Master() {
    }

    public Master(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public void wei() {
        System.out.println("主人正在喂" + pet.getName());
    }
    public void liu() {
        if (pet instanceof Dog) {
            Dog dog = (Dog)pet;
            System.out.println("主人正在遛" + dog.getName() + "，请注意带牵引绳");
        }else if (pet instanceof Cat) {
            Cat cat = (Cat)pet;
            System.out.println("主人正在溜" + cat.getName() + "，请注意带笼猫包");
        }
    }
}
