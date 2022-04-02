package com.company.lab4;

import java.util.Scanner;

public class Symulacja {
    public static void main(String[] args) {
        System.out.println("Podaj ilość prób: ");
        Scanner scanner = new Scanner(System.in);
        int proby = scanner.nextInt();

        Moneta moneta = new Moneta();
        moneta.rzutMoneta(proby);

    }
}
