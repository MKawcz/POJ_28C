package com.company.uzupełniające1;

public enum Przeciwnik {
    WIESNIAK(4, Bron.KUSZA, Zbroja.SKORZANA),
    RYCERZ(6, Bron.MIECZ, Zbroja.SREBRNA),
    SEBIX(9, Bron.LUK, Zbroja.DIAMENTOWA);

    private int punktyZycia;
    Bron bron;
    Zbroja zbroja;
    Przeciwnik(int punktyZycia, Bron bron, Zbroja zbroja){
        this.punktyZycia = punktyZycia;
        this.bron = bron;
        this.zbroja = zbroja;
    }

    public int getPunktyZycia() {
        return punktyZycia;
    }
}
