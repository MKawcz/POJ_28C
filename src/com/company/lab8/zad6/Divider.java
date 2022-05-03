package com.company.lab8.zad6;

import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        try {
            String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
            String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");

            int result = convertToInteger(number) / convertToInteger(divider);
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono niepoprawny znak");
        } catch (ArithmeticException e) {
            System.out.println("Błąd, nie można dzielić przez 0");
        }
    }


    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
}
