package com.company.lab11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        System.out.println(zliczUnikatoweZnaki((tekst)));
    }

    public static int zliczUnikatoweZnaki(String tekst){
        String[] litery = tekst.split("");
        Map<String, Integer> zbior = new LinkedHashMap<>();
        int wystapienia = 0;
        for(String litera: litery){
            if(!zbior.containsKey(litera)){
                zbior.put(litera,1);
            } else {
                wystapienia = zbior.get(litera);
                zbior.put(litera,++wystapienia);
            }
        }
        return zbior.keySet().size();
    }
}
