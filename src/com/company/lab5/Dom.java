package com.company.lab5;

public class Dom {
    private String ulica;
    private double powierzchniaDomu;
    private double powierzchniaOgrodu;
    private int iloscPieter;
    private boolean czZamieszkamy;

    public Dom(String ulica, double powierzchniaDomu, double powierzchniaOgrodu, int iloscPieter, boolean czZamieszkamy) {
        this.ulica = ulica;
        this.powierzchniaDomu = powierzchniaDomu;
        this.powierzchniaOgrodu = powierzchniaOgrodu;
        this.iloscPieter = iloscPieter;
        this.czZamieszkamy = czZamieszkamy;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "ulica='" + ulica + '\'' +
                ", powierzchniaDomu=" + powierzchniaDomu +
                ", powierzchniaOgrodu=" + powierzchniaOgrodu +
                ", iloscPieter=" + iloscPieter +
                ", czZamieszkamy=" + czZamieszkamy +
                '}';
    }
}
