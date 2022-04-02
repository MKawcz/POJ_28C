package com.company.lab4;

import java.util.Random;

public class Moneta {
    public void rzutMoneta(int iloscProb) {
        int a = 0;

        Random random = new Random();

        double liczReszki = 0;
        double liczOrly = 0;
        int x = 0;

        while (a < iloscProb) {
            a++;
            x = random.nextInt(2);
            if (x == 0) {
                System.out.println("Reszka!");
                liczReszki++;
            } else if (x == 1) {
                System.out.println("Orzeł!");
                liczOrly++;
            }
        }

        System.out.println((liczOrly / iloscProb) * 100.0 + "% orzeł / " + (liczReszki / iloscProb) * 100.0 + "% reszka");
    }


}
