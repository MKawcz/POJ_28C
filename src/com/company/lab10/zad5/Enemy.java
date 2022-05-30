package com.company.lab10.zad5;

import com.company.lab10.zad5.Targettable;

import java.util.Random;

public class Enemy implements Targettable {
    @Override
    public void shootAt() {
        Random random = new Random();
        int szansa = random.nextInt(5);
        System.out.println("Twój cel to przeciwnik, szansa na trafienie to 20%");
        if(szansa == 1){
            System.out.println("Brawo, trafiłeś w przeciwnika!");
        } else {
            System.out.println("Niestety, przeciwnik jest cały i zdrowy...");
        }
    }
}
