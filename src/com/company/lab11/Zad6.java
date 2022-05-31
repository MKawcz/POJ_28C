package com.company.lab11;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Zad6 {
    public static void main(String[] args) {
        sumaSeta();
    }

    public static void sumaSeta() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> liczby = new HashSet<>();
        System.out.println("Podaj 10 unikatowych liczb:");
        for (int i = 0; i < 9; i++) {
            if(!liczby.contains(scanner.nextInt())){
                liczby.add(scanner.nextInt());
            } else {
                System.out.println("podano juz ta liczbe");
            }
        }
        int sum = 0;
        for(int i : liczby) {
            sum += i;
        }

        System.out.println("suma podanych liczb: " + sum);
    }
}
