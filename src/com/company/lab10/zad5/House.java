package com.company.lab10.zad5;

import com.company.lab10.zad5.Targettable;

import java.util.Random;

public class House implements Targettable {
    @Override
    public void shootAt() {
        Random random = new Random();
        int szansa = random.nextInt(2);
        System.out.println("Twój cel to dom, szansa na trafienie to 50%");
        if(szansa == 1){
            System.out.println("Brawo, trafiłeś w dom!");
        } else {
            System.out.println("Niestety, dom pozostał w całości...");
        }
    }
}
