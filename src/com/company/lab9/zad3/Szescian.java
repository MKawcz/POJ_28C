package com.company.lab9.zad3;

public class Szescian extends Figura3D{
    public Szescian(int a) {
        super(new int[]{a,a,a,a,a,a,a,a,a,a,a,a});
    }

    @Override
    public double objetosc() {
        return krawedzie[0] * krawedzie[0] * krawedzie[0];
    }

    @Override
    public double pole() {
        return 0;
    }

    @Override
    public double sumaKrawedzi() {
        return 0;
    }
}
