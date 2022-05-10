package com.company.lab9.zad3;

public class Prostokat extends Figura2D {
    public Prostokat(int a, int b) {
        super(new int[]{a,b,a,b});
    }

    @Override
    public double pole() {
        return krawedzie[0]*krawedzie[1];
    }

    @Override
    public double sumaKrawedzi() {
        return (krawedzie[0]*2) + (krawedzie[1]*2);
    }
}
