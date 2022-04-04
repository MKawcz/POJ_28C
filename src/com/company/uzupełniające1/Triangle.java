package com.company.uzupełniające1;

public class Triangle {
    private int bokA;
    private int bokB;
    private int bokC;
    private int wysokosc;

    Triangle(){
        bokA = 3;
        bokB = 4;
        bokC = 5;
        wysokosc = 4;
    }

    Triangle(int bokA, int bokB, int bokC, int wysokosc){
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.wysokosc = wysokosc;
    }

    public int pole(){
        return (bokA * wysokosc) / 2;
    }

    public int obwod(){
        return bokA + bokB + bokC;
    }

    public void czyLegalny(){
        if ((bokA + bokB > bokC) && (bokA + bokC > bokB) && (bokB + bokC > bokA)) {
            System.out.println("TAK");
        } else if (bokA <= 0 || bokB <= 0 || bokC <= 0) {
            System.out.println("BŁĄD");
        } else {
            System.out.println("NIE");
        }
    }
}
