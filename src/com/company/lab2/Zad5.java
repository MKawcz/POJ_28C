package com.company.lab2;

import static com.company.lab2.Wiatrak.SLOW;
import static com.company.lab2.Wiatrak.MEDIUM;
import static com.company.lab2.Wiatrak.FAST;

public class Zad5 {
    public static void main(String[] args) {
        Wiatrak wiatrak = new Wiatrak();
        Wiatrak wiatrak2 = new Wiatrak(SLOW, true, 7, "zielony");

        wiatrak.informacje();       // do metody void nie potrzebujesz sout'a
        wiatrak2.informacje();
    }
}
