package com.company.lab10.zad2;

public class Okrag implements Figura, Comparable{
    private double r;

    public Okrag(double r) {
        this.r = r;
    }

    @Override
    public Double obliczPole() {
        return Math.PI*r*r;
    }

    @Override
    public Double obliczObwod() {
        return 2*Math.PI*r;
    }

    @Override
    public int compareTo(Object o) {
        Figura that = (Figura) o;
        return obliczPole().compareTo(that.obliczPole());
    }

    @Override
    public String toString() {
        return "Okrag{" +
                "r=" + r +
                '}';
    }
}
