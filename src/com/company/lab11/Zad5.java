package com.company.lab11;

import java.util.*;

public class Zad5 {
    public static final String SPOLGLOSKI_KlUCZ = "spolgloski";
    public static final String SAMOGLOSKI_KLUCZ = "samogloski";
    private static List<String> SPOLGLOSKI;
    private static List<String> SAMOGLOSKI;

    static {
        SPOLGLOSKI = new ArrayList<>(Arrays.asList("b","c","d","f","g","h","j","k","l","m","n","p","r","s", "t", "w", "x", "z"));
        SAMOGLOSKI = new ArrayList<>(Arrays.asList("a", "e", "i", "o","u", "y"));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        System.out.println(zliczLitery((tekst)));
    }

    public static Map<String, Integer> zliczLitery(String tekst){
        String[] litery = tekst.split("");
        Map<String, Integer> zbior = new LinkedHashMap<>();
        for (String litera:litery){
            if(SPOLGLOSKI.contains(litera.toLowerCase())){
                if(zbior.containsKey(SPOLGLOSKI_KlUCZ)){
                    int ilosc = zbior.get(SPOLGLOSKI_KlUCZ);
                    zbior.put(SPOLGLOSKI_KlUCZ, ++ilosc);
                }else {
                    zbior.put(SPOLGLOSKI_KlUCZ,1);
                }
            }else if(SAMOGLOSKI.contains(litera.toLowerCase())){
                if(zbior.containsKey(SAMOGLOSKI_KLUCZ)){
                    int ilosc = zbior.get(SAMOGLOSKI_KLUCZ);
                    zbior.put(SAMOGLOSKI_KLUCZ, ++ilosc);
                } else{
                    zbior.put(SAMOGLOSKI_KLUCZ,1);
                }
            }
        }
        return zbior;
    }
}
