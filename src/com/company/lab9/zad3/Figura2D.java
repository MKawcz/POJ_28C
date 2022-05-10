package com.company.lab9.zad3;

public abstract class Figura2D extends Figura{
    public Figura2D(int[] krawedzie) {
        super(krawedzie);
    }

    @Override
    public abstract double pole();

    @Override
    public abstract double sumaKrawedzi();
}
