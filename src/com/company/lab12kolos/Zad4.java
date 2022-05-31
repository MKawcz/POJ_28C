package com.company.lab12kolos;

import java.util.*;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();
        System.out.println(zliczSamogloski((tekst)));
    }
    private static List<String> SAMOGLOSKI;
    static {
        SAMOGLOSKI = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "y"));
    }

    public static Map<String, Integer> zliczSamogloski(String tekst){
        String[] litery = tekst.split("");
        Map<String, Integer> zbior = new LinkedHashMap<>();
        for (String litera : litery){
            if(SAMOGLOSKI.contains(litera.toLowerCase())){
                if(zbior.containsKey(litera)){
                    int ilosc = zbior.get(litera);
                    zbior.put(litera, ++ilosc);
                } else{
                    zbior.put(litera,1);
                }
            }
        }
        return zbior;
    }

}
