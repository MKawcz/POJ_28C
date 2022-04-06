package com.company.lab5.animals;

import com.company.lab5.animals.Animal;

public class Dog extends Animal {
    public Dog(String name, String kolor) {
        super(name, kolor);
    }

    public void makeSound(){
        System.out.printf("[%s:%s], Hau Hau\n", name, kolor);
    }
}
