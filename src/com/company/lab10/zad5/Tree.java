package com.company.lab10.zad5;

import com.company.lab10.zad5.Targettable;

import java.util.Random;

public class Tree implements Targettable {
    @Override
    public void shootAt() {
        Random random = new Random();
        int szansa = random.nextInt(3);
        System.out.println("Twój cel to drzewo, szansa na trafienie to 33%");
        if(szansa == 1){
            System.out.println("Brawo, trafiłeś w drzewo!");
        } else {
            System.out.println("Niestety, drzewo pozostało w całości...");
        }
    }
}
