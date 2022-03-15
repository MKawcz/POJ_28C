package com.company.lab2;

public class Zad3 {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(2, 2);
        Punkt pkt = new Punkt(-2, -2);
        Punkt zerowy = new Punkt();

        /*punkt.wyswietl();
        zerowy.wyswietl();*/

        System.out.println(punkt.odleglosc(-2,-2));
        System.out.println(punkt.odleglosc2(zerowy));
        System.out.println(punkt.odleglosc2(pkt));


    }
}
