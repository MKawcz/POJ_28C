package com.company.lab11;


import java.util.ArrayList;
import java.util.List;

public class Zad7 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Siema");
        lista.add("co");
        lista.add("tam");
        lista.add("cool");
        lista.add("a");
        lista.add("u");
        lista.add("cb");

        System.out.println(parzysteDlugosci(lista));
    }

    public static List<String> parzysteDlugosci(List<String> tekst) {
        List<String> zbior = new ArrayList<>();
        for (String s : tekst) {
            if (s.length() % 2 == 0) {
                zbior.add(s);
            }
        }
        return zbior;
    }
}