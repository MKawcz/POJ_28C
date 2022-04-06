package com.company.lab5.cars;

import com.company.lab5.cars.Car;

public class Car1 extends Car {
    private int przebieg;
    public Car1(String kolor, String marka, int przebieg) {
        super(kolor, marka);
        this.przebieg = przebieg;
    }
}
