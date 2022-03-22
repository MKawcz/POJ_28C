package com.company.lab3;

public class Dog {
    String breed;
    int age;
    String color;

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String bark() {
        return "Bark!";
    }

    public String sleep() {
        return "*sleep*";
    }
}
