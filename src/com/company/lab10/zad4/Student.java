package com.company.lab10.zad4;

public class Student{
    private String imie;
    private String nazwisko;
    private String indeks;

    public Student(String imie, String nazwisko, String indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getIndeks() {
        return indeks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks='" + indeks + '\'' +
                '}';
    }
}
