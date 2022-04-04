package com.company.uzupełniające1;

public enum Cele {
    PIERWSZEPIECCELOW(80),
    KOLEJNETRZYCELE(60),
    OSTATNIEDWA(40);

    int szansa;

    Cele(int szansa) {
        this.szansa = szansa;
    }

    public int getSzansa() {
        return szansa;
    }
}
