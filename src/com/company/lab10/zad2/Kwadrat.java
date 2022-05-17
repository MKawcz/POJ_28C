package com.company.lab10.zad2;

public class Kwadrat  implements Figura, Comparable{
    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public Double obliczPole() {
        return a*a;
    }

    @Override
    public Double obliczObwod() {
        return a*4;
    }

    @Override
    public int compareTo(Object o) {
        Figura that = (Figura) o;
        return obliczPole().compareTo(that.obliczPole());
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "a=" + a +
                '}';
    }
}
