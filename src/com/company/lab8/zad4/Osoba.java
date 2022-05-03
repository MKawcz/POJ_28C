package com.company.lab8.zad4;

import java.util.Scanner;

import static sun.util.locale.LocaleUtils.isEmpty;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    Osoba(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        sprawdzDaneOsoby(imie, nazwisko, rokUrodzenia);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        if(imie.isEmpty() || nazwisko.isEmpty()){
            throw new Exception("Błędne dane. Nie udało się utworzyć obiektu ");
        }

    }

    public static void tworzenieOsoby(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj imię dla nowej osoby: ");
            String firstName = scanner.nextLine();
            System.out.println("Podaj nazwisko dla nowej osoby: ");
            String lastName = scanner.nextLine();
            System.out.println("Podaj rok urodzenia nowej osoby: ");
            int yearOfBirth = scanner.nextInt();
            Osoba osoba = new Osoba(firstName, lastName, yearOfBirth);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            tworzenieOsoby();
        }
    }

    public void sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia){
        if(this.imie == imie && this.nazwisko == nazwisko && this.rokUrodzenia == rokUrodzenia){
            System.out.println("Poprawne dane");
        } else {
            System.out.println("Niepoprawne dane");
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }
}
