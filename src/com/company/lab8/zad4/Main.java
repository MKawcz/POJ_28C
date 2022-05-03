package com.company.lab8.zad4;

import java.util.Scanner;

import static com.company.lab8.zad4.Osoba.tworzenieOsoby;

public class Main {
    public static void main(String[] args) throws Exception {
        // działa błędnie, po ponownym wczytaniu wyświetla naraz zapytanie o imie i nazwisko
        /*Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            try {
                System.out.println("Podaj imię dla nowej osoby: ");
                String firstName = scanner.nextLine();
                System.out.println("Podaj nazwisko dla nowej osoby: ");
                String lastName = scanner.nextLine();
                System.out.println("Podaj rok urodzenia nowej osoby: ");
                int yearOfBirth = scanner.nextInt();
                Osoba osoba = new Osoba(firstName, lastName, yearOfBirth);
                done = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }*/
        tworzenieOsoby();
    }
}
