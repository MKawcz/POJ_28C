package com.company.lab3;

import java.util.Scanner;

import static com.company.lab3.zad1.compare;

public class Main {
    public static void main(String[] args) {
    //    System.out.println(compare(1,2));

    /*Dog dog = new Dog("Shiba", 4, "yellow");
        System.out.println(dog.bark());
        System.out.println(dog.sleep());*/

    /*TV tv = new TV(1, 9, true);
    Remote remote = new Remote(tv);
        System.out.println(remote.change_channel_up());
        System.out.println(remote.change_channel_down());

        System.out.println(remote.change_volume_up());
        System.out.println(remote.change_volume_down());

        System.out.println(remote.turn());
        System.out.println(remote.turn());*/

        Konto[] konta = new Konto[4];
        konta[0] = new Konto(1,100);
        konta[1] = new Konto(2,100);
        konta[2] = new Konto(3,100);
        konta[3] = new Konto(4,100);
        konta[4] = new Konto(5,100);

        Scanner scanner = new Scanner();

        int a = scanner.nextInt(System.in);
    }
}
