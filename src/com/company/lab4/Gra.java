package com.company.lab4;

import java.util.Random;
import java.util.Scanner;

public class Gra {
    private int min;
    private int max;

    public void graj() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dolny zakres: ");
        int minimum = scanner.nextInt();

        System.out.println("Podaj górny zakres: ");
        int maximum = scanner.nextInt();

        min = minimum;
        max = maximum;

        Random random = new Random();
        int x = random.nextInt(max);
        if(x < min) {
            x = random.nextInt(max);
        }

        int liczba = 0;
        int a = 0;

        while(a < 5) {
            a++;
            System.out.println("Podaj liczbę z zakresu: ");
            liczba = scanner.nextInt();
            if(liczba < x) {
                System.out.println("za mała");
            } else if (liczba > x) {
                System.out.println("za duża");
            } else {
                System.out.println("Brawo, trafiłeś!");
                break;
            }
        }

        if (a == 5) {
            System.out.printf("Porażka! Nieodgadnięta liczba to: %d\n", x);
        }



    }
}
