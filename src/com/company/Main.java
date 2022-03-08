package com.company;

import java.util.Scanner;

import static com.company.avg.average;
import static com.company.max.maximum;
import static com.company.med.mediana;
import static com.company.min.minimum;
import static com.company.nwd.Nwd;
import static com.company.sum.suma;

public class Main {

    public static void main(String[] args) {

        // zad 1
        // double x = ((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5);
        // System.out.println(x);

        // zad 2
        /*System.out.println("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextInt();
        double farneheit = (9/5.0) * liczba + 32;
        System.out.println(farneheit);*/

        // zad 3
        /*System.out.println("Miles  Kilomiters");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i + "      " + i * 1.609);
        }*/

        // zad 4
        /*System.out.println("Podaj liczbe od 1 do 7: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a >= 1 && a <= 7) {
            switch (a) {
                case 1:
                    System.out.println("Poniedzialek");
                    break;
                case 2:
                    System.out.println("Wtorek");
                    break;
                case 3:
                    System.out.println("Sroda");
                    break;
                case 4:
                    System.out.println("Czwartek");
                    break;
                case 5:
                    System.out.println("Piatek");
                    break;
                case 6:
                    System.out.println("Sobota");
                    break;
                case 7:
                    System.out.println("Niedziela");
                    break;
            }

        } else
        {
            System.out.println("bledne dane!");
        }*/

        // zad 5
       /* System.out.println("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char[] tab = new char[a];

        for(int i = 0; i < a; i++)
        {
            System.out.println("Podaj " + i + " element: ");
            char x = scanner.next().charAt(0);
            tab[i] = x;
        }

        for(int j = 0; j < a; j++)
        {
            System.out.println(tab[j]);
        }*/

        // zad 6
        /*System.out.println("Podaj wielkosc tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj pierwszy element: ");
        int b = scanner.nextInt();
        int[] tab = new int[a];
        tab[0] = b;

        for (int i = 1; i < a; i++) {
            b++;

            if(b % 2 == 0)
            {
                tab[i] = b;
            }
            else
            {
                b++;
                tab[i] = b;
            }
        }

        for(int k = 0; k < a; k++)
        {
            System.out.println(tab[k]);
        }


        System.out.println("Min: " + minimum(tab));

        System.out.println("Max: " + maximum(tab));

        System.out.println("Suma: " + suma(tab));

        System.out.println("Srednia: " + average(tab));

        System.out.println("Mediana: " + mediana(tab));*/


        // zad 7
        System.out.println("Podaj pierwsza liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int b = scanner.nextInt();

        System.out.println(Nwd(a, b));
    }
}
