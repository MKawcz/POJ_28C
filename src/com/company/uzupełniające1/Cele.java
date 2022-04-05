package com.company.uzupełniające1;

public enum Cele {
    PIERWSZEPIECCELOW(0.2),
    KOLEJNETRZYCELE(0.4),
    OSTATNIEDWA(0.6);

    double szansa;

    Cele(double szansa) {
        this.szansa = szansa;
    }

    public double getSzansa() {
        return szansa;
    }
}
