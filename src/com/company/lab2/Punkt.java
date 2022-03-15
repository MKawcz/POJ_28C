package com.company.lab2;

public class Punkt {
    int x;
    int y;

    public Punkt() {
        int x;
        int y;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void wyswietl() {
        System.out.printf("(%d, %d)", x, y);
    }

    public double odleglosc(int x, int y) {
        int a = Math.abs(this.y - y);
        int b = Math.abs(this.x - x);
        double dist = Math.sqrt(a * a + b * b);
        return dist;
    }

    public double odleglosc2(Punkt p) {
        return odleglosc(p.x, p.y);
    }

}
