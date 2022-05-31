package com.company.lab11;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Zad2 {
    public static void main(String[] args) {
        lotto();
    }

    public static void lotto(){
        //int wynik = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> wybraneLiczby = new HashSet<>();
        Set<Integer> wylosowaneLiczby = new HashSet<>();
        System.out.println("Podaj 6 liczb od 1 do 49:");
        for (int i = 0; i < 5; i++){
            wybraneLiczby.add(scanner.nextInt());
            wylosowaneLiczby.add(random.nextInt(49));
        }

        /*String[] liczby = wybraneLiczby.toArray(new String[wybraneLiczby.size()]);
        String[] liczby2 = wylosowaneLiczby.toArray(new String[wylosowaneLiczby.size()]);

        for (int i = 0; i < 6; i++) {
            if(liczby[i] == liczby2[i]){
                wynik++;
            }
        }*/


        System.out.println("wybrane liczby:");
        System.out.println(wybraneLiczby);
        System.out.println("wylosowane liczby:");
        System.out.println(wylosowaneLiczby);

      //  System.out.println("Trafiłeś " +  + " liczb");
    }
}
