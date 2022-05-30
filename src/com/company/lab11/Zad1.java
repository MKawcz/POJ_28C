package com.company.lab11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zad1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(3);
        lista.add(5);

        System.out.println(znajdzDuplikaty(lista));
        System.out.println(wyswietlBezDuplikatow(lista));
    }

    public static Set<Integer> znajdzDuplikaty(List<Integer> listContainingDuplicates) {
        final Set<Integer> setToReturn = new HashSet<>();
        final Set<Integer> set1 = new HashSet<>();
        for (Integer yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        return setToReturn;
    }

    public static List wyswietlBezDuplikatow(List lista){
        List zbior = new ArrayList<>();
        for(Object element: lista){
            if(!zbior.contains(element)){
                zbior.add(element);
            }
        }
        return zbior;
    }

}
