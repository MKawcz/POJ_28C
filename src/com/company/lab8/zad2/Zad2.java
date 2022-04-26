package com.company.lab8.zad2;

public class Zad2 {
    public static void main(String[] args) {
        try{
            wyjatek("Test");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void wyjatek(String tekst) {
        throw new RuntimeException("Niejawny blad " + tekst);
    }
}
