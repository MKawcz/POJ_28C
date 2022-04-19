package com.company.lab7.zad1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        Square square = new Square(4);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3,4,5,4);
        Shape[] shapes = {rectangle, square, circle, triangle};

        for (Shape i : shapes) {
            System.out.println(i.getArea());
            System.out.println(i.getPerimeter());
        }
    }
}
