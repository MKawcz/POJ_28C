package com.company.lab7.zad1;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }
}
