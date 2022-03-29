package com.company.lab4;

import java.util.Random;
import java.util.Scanner;

public class Gra {
    private int min;
    private int max;

    public Gra(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void graj() {
        Random random = new Random();
        int x = random.nextInt(max);
        if(x < min) {
            x = random.nextInt(max);
        }

        System.out.println("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int a = 0;

        while(liczba != x && a < 6) {
            a++;
            System.out.println("Podaj liczbe: ");
            liczba = scanner.nextInt();
        }

        if (a == 5) {
            System.out.printf("Porażka! Nieodgadnięta liczba to: %d\n", x);
        }

        if(liczba < x) {
            System.out.println("za mała");
        } else if (liczba > x) {
            System.out.println("za duża");
        } else if (liczba == x) {
            System.out.println("Brawo, trafiłeś!");
        }
    }
}
