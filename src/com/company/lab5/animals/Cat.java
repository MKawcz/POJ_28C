package com.company.lab5.animals;

import com.company.lab5.animals.Animal;

public class Cat extends Animal {
    public Cat(String name, String kolor) {
        super(name, kolor);
    }

    public void makeSound(){
        System.out.printf("[%s:%s], Miau miau \n", name, kolor);
    }
}
