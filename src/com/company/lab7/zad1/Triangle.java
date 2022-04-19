package com.company.lab7.zad1;

public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;
    private int h;

    Triangle(int a, int b, int c, int h){
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.h = h;
        } else if (a <= 0 || b <= 0 || c <= 0) {
            this.a = 3;
            this.b = 4;
            this.c = 5;
            this.h = 4;
        } else {
            this.a = 3;
            this.b = 4;
            this.c = 5;
            this.h = h;
        }
    }

    @Override
    public double getArea() {
        return (a * h) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
