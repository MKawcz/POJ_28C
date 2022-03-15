package com.company.lab2;

public class MyCircle {
    int radius;

    public MyCircle(int radius) {
        this.radius = radius;
    }

    public double obwod() {
        return Math.PI * 2 * radius;
    }

    public double pole() {
        return Math.PI * radius * radius;
    }

    public int srednica() {
        return radius + radius;
    }
}
