package com.company.lab9.zad3;

public abstract class Figura {
    protected int[] krawedzie;
    public abstract double pole();
    public abstract double sumaKrawedzi();

    public Figura(int[] krawedzie) {
        this.krawedzie = krawedzie;
    }
}
