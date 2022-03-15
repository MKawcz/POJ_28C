package com.company.lab2;

public class Kwadrat {
    int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public int pole() {
        return bok * bok;
    }

    public int obwod() {
        return bok * 4;
    }
}
