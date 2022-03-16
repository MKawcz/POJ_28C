package com.company.lab2;

public class Wiatrak {
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    int speed;
    boolean on;
    int radius;
    String color;


    public Wiatrak() {
       int speed;
       boolean on;
       int radius;
       String color;
    }

    public String wlanczony(boolean o) {
        if (on == true) {
            return "włączony";
        } else {
            return "wyłączony";
        }
    }

    public Wiatrak(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void informacje() {
        System.out.printf("Prędkość: %d\n", speed);
        System.out.printf("Włączony: %s\n", on?"włączony" : "wyłączony");
        System.out.printf("Promień: %d\n", radius);
        System.out.printf("Kolor: %s\n", color);
    }


}
