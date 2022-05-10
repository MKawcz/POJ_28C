package com.company.lab9.zad3;

public class Kwadrat extends Figura2D{
    public Kwadrat(int a) {
        super(new int[]{a,a,a,a});
    }

    @Override
    public double pole() {
        return krawedzie[0]*krawedzie[0];
    }

    @Override
    public double sumaKrawedzi() {
        return krawedzie[0]*4;
    }
}
