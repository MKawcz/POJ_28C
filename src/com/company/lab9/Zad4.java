package com.company.lab9;

import com.company.lab8.zad1.WrongCharException;

import java.util.Scanner;

public class Zad4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            rodzajDzialania();

    }

    public static void rodzajDzialania() {
        System.out.println("Wybierz rodzaj działania:\n" +
                "1 - Dodawanie\n" +
                "2 - Odejmowanie\n" +
                "3 - Mnożenie\n" +
                "4 - Dzielenie:\n");
        char dzialanie = scanner.nextLine().charAt(0);
        if (dzialanie == '1') {
            dodawanie();
        } else if (dzialanie == '2') {
            odejmowanie();
        } else if (dzialanie == '3') {
            mnozenie();
        } else if (dzialanie == '4') {
            dzielenie();
        } else {
            System.out.println("Wprowadzono niepoprawny znak, proszę wybierz działanie jescze raz:");
            rodzajDzialania();
        }
    }

    public static int pobieranieLiczb(){
        try {
            String a = scanner.nextLine();
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono nieprawidlowe znaki, proszę wprowadź liczbę jeszcze raz: ");
            return pobieranieLiczb();
        }
    }

    public static void dodawanie(){
        System.out.println("Podaj pierwszą liczbę: ");
        int a = pobieranieLiczb();
        System.out.println("Podaj drugą liczbę: ");
        int b = pobieranieLiczb();
        System.out.println("Wynik dodawania na liczbach " + a + " oraz " + b + " wynosi: "+ (a+b));
    }

    public static void odejmowanie(){
        System.out.println("Podaj pierwszą liczbę: ");
        int a = pobieranieLiczb();
        System.out.println("Podaj drugą liczbę: ");
        int b = pobieranieLiczb();
        System.out.println("Wynik odejmowania na liczbach " + a + " oraz " + b + " wynosi: "+ (a-b));
    }

    public static void mnozenie(){
        System.out.println("Podaj pierwszą liczbę: ");
        int a = pobieranieLiczb();
        System.out.println("Podaj drugą liczbę: ");
        int b = pobieranieLiczb();
        System.out.println("Wynik mnożenia na liczbach " + a + " oraz " + b + " wynosi: "+ (a*b));
    }

    public static void dzielenie(){
        try {
            System.out.println("Podaj pierwszą liczbę: ");
            int a = pobieranieLiczb();
            System.out.println("Podaj drugą liczbę: ");
            int b = pobieranieLiczb();
            System.out.println("Wynik dzielenia na liczbach " + a + " oraz " + b + " wynosi: "+ (a/b));
        } catch (ArithmeticException e) {
            System.out.println("Niedozwolone działanie proszę podaj liczby jescze raz: ");
            dzielenie();
        }
    }

}
