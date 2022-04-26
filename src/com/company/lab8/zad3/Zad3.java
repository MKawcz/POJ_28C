package com.company.lab8.zad3;

import java.io.IOException;

public class Zad3 {
    public static void main(String[] args) {
        try {
            wyjatek("tekst");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("test");
    }

    public static void wyjatek(String tekst) throws IOException {
        throw new IOException("Blad " + tekst);         // to samo co return tylko dla wyjątków
    }
}
