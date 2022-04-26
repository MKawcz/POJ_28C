package com.company.lab8.zad1;

import java.util.Scanner;

public class Zad1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(dodawanie());
    }

    public static void rodzajDzialania() throws WrongCharException {
        System.out.println("wybierz rodzaj działania (+, - , *, /): ");
        char dzialanie = scanner.nextLine().charAt(1);
            if (dzialanie == '+') {
                System.out.println(dodawanie());
            } else if (dzialanie == '-') {
                System.out.println(odejmowanie());
            } else if (dzialanie == '*') {
                System.out.println(mnozenie());
            } else if (dzialanie == '/') {
                System.out.println(dzielenie());
            } else {
                throw new WrongCharException();
                rodzajDzialania();
            }
    }

    public static int pobieranieLiczb(){
        try {
            String a = scanner.nextLine();
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono nieprawidlowe znaki, proszę wprowadź liczby jeszcze raz: ");
            return pobieranieLiczb();
        }
    }

    public static int dodawanie(){
        System.out.println("Podaj pierwszą liczbę: ");
        int a = pobieranieLiczb();
        System.out.println("Podaj drugą liczbę: ");
        int b = pobieranieLiczb();
        return a + b;
    }

    public static int odejmowanie(){
        System.out.println("Podaj pierwszą liczbę: ");
        int a = pobieranieLiczb();
        System.out.println("Podaj drugą liczbę: ");
        int b = pobieranieLiczb();
        return a - b;
    }

    public static int mnozenie(){
        System.out.println("Podaj pierwszą liczbę: ");
        int a = pobieranieLiczb();
        System.out.println("Podaj drugą liczbę: ");
        int b = pobieranieLiczb();
        return a * b;
    }

    public static int dzielenie(){              // dodaj catcha na dzielenie przez 0
        System.out.println("Podaj pierwszą liczbę: ");
        int a = pobieranieLiczb();
        System.out.println("Podaj drugą liczbę: ");
        int b = pobieranieLiczb();
        return a / b;
    }

}
