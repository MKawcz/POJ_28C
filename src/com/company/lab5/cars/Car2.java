package com.company.lab5.cars;

import com.company.lab5.cars.Car;

public class Car2 extends Car {
    private double pojemnoscSilnika;
    public Car2(String kolor, String marka, double pojemnoscSilnika) {
        super(kolor, marka);
        this.pojemnoscSilnika = pojemnoscSilnika;
    }
}
