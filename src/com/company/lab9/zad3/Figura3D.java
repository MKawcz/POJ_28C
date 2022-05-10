package com.company.lab9.zad3;

public abstract class Figura3D extends Figura{
    public Figura3D(int[] krawedzie) {
        super(krawedzie);
    }

    public abstract double objetosc();

    @Override
    public abstract double pole();

    @Override
    public abstract double sumaKrawedzi();
}
