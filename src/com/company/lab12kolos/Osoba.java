package com.company.lab12kolos;

import java.util.Arrays;

public class Osoba implements Comparable{
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Maciek", "Kowalski");
        Osoba osoba1 = new Osoba("Mikolaj", "Nowak");
        Osoba osoba2 = new Osoba("Tomek", "Szuba");
        Osoba[] osoby = {osoba, osoba1, osoba2};

        System.out.println("przed sortowaniem");
        for(Osoba o: osoby){
            System.out.println(o.toString());
        }

        System.out.println("po sortowaniu: ");
        Arrays.sort(osoby);
        for(Osoba o: osoby){
            System.out.println(o.toString());
        }

    }

    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Osoba that = (Osoba) o;
        return -1 * nazwisko.compareTo(that.nazwisko);
    }

}
