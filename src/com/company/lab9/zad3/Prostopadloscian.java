package com.company.lab9.zad3;

public class Prostopadloscian extends Figura3D{
    public Prostopadloscian(int a, int b, int c) {
        super(new int[]{a,b,c,a,b,c,a,b,c,a,b,c});
    }

    @Override
    public double objetosc() {
        return krawedzie[0] * krawedzie[1] * krawedzie[2];
    }

    @Override
    public double pole() {
        return 2*((krawedzie[0]*krawedzie[1]) + (krawedzie[0]*krawedzie[2]) + (krawedzie[1]*krawedzie[2]));
    }

    @Override
    public double sumaKrawedzi() {
        return (krawedzie[0] * 4) + (krawedzie[1] * 4) + (krawedzie[2] * 4);
    }
}
