package com.learn.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private final String sex;
    private final int age;
    private final List<String> favorite;

    public static class Builder{
        //required parameters
        private final String name;
        private final String sex;
        private final int age;
        //optional parameters
        private ArrayList<String> favorites= new ArrayList<>();

        public Builder favorite(String favorite)throws IllegalArgumentException {
            if (favorite == null || "".equals(favorite)) {
                throw new IllegalArgumentException("invalid param");
            }
            this.favorites.add(favorite);

            return this;
        }

        public Builder(String name, String sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Person build() {
            return new Person(this);
        }

        protected Builder self() {
            return this;
        }
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.favorite = builder.favorites;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", favorite=" + favorite +
                '}';
    }
}
