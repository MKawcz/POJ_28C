package com.company.lab11;

import java.util.*;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        System.out.println(skorowidzLiterowy(tekst));
    }
    public static Map<String, Set<Integer>> skorowidzLiterowy(String tekst){
        String[] litery = tekst.split("");
        Map<String, Set<Integer>> zbior = new HashMap<>();
        Set<Integer> indeks;
        /*for(String litera: litery){
            //if(zbior.containsKey(litera)){
                indeks = zbior.get(litera);
                zbior.put(litera, indeks);
           *//* } else {
                indeks =
                zbior.put(litera, );
            }*//*
        }*/
        return zbior;
    }
}
