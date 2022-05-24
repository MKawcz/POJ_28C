package com.company.lab11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        System.out.println(zliczWystapieniaSlow(tekst));
    }

    public static Map<String, Integer> zliczWystapieniaSlow(String tekst){
        String[] slowa = tekst.split(" ");
        Map<String, Integer> mapaSlow = new HashMap<>();
        for (String slowo:slowa){
            if (mapaSlow.containsKey(slowo)){
                int wystapienia = mapaSlow.get(slowo);
                mapaSlow.put(slowo, ++wystapienia);
            }else {
                mapaSlow.put(slowo, 1);
            }
        }
        return mapaSlow;
    }
}
