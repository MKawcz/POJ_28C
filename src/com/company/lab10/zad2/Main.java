package com.company.lab10.zad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(2);
        Kwadrat kwadrat2 = new Kwadrat(7);
        Kwadrat kwadrat3 = new Kwadrat(6);
        Prostokat prostokat = new Prostokat(2,6);
        Okrag okrag = new Okrag(7);
        Figura[] figury = {okrag, prostokat, prostokat};

        Arrays.sort(figury);
        for (Figura f: figury) {
            System.out.println(f.toString());
            System.out.println("Pole figury: " + f.obliczPole());
            System.out.println("Obwod figury: " + f.obliczObwod());
        }



        //zmien zeby porownywac rozne figury





    }
}
