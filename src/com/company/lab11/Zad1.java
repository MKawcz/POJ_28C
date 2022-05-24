package com.company.lab11;

import java.util.ArrayList;
import java.util.List;

public class Zad1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(3);
        lista.add(5);

        System.out.println(wyswietlZduplikowaneElementy(lista));
    }

    public static List wyswietlZduplikowaneElementy(List lista){
        List zbior = new ArrayList();
        for(Object element: lista){
            if(zbior.contains(element)){
                zbior.add(element);
            }
        }
        return zbior;
    }

}
