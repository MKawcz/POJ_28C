package com.company.uzupełniające1;

public enum Zbroja {
    SKORZANA(3),
    SREBRNA(4),
    ZLOTA(5),
    DIAMENTOWA(6);

    private int wytrzymalosc;
    Zbroja(int wytrzymalosc){
        this.wytrzymalosc = wytrzymalosc;
    }

    public int getWytrzymalosc() {
        return wytrzymalosc;
    }
}
