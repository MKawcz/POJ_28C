package com.company.lab10.zad2;

public class Prostokat implements Figura, Comparable{
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double obliczPole() {
        return a*b;
    }

    @Override
    public Double obliczObwod() {
        return (a*2) + (b*2);
    }

    @Override
    public int compareTo(Object o) {
        Figura that = (Figura)o;
        return obliczPole().compareTo(that.obliczPole());
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
