package com.company.lab4;

public class Ulamek {
    private int licznik;
    private int mianownik;

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public void setMianownik(int mianownik) {
        this.mianownik = mianownik;
    }

    /*public void dodawanie(Ulamek u) {
        if(this.mianownik != u.mianownik) {
           this.licznik = this.licznik * u.mianownik;
           u.licznik = u.licznik * this.mianownik;
           this.mianownik =  this.mianownik * u.mianownik;
        }
        int licz = (this.licznik + u.licznik) / Nwd((this.licznik + u.licznik), this.mianownik);
        int mian = this.mianownik / Nwd((this.licznik + u.licznik), this.mianownik);
        System.out.println(licz + "/" + mian);
    }*/

    public void dodawanie(Ulamek u) {
        if(this.mianownik != u.mianownik) {
           int licz = (this.licznik * u.mianownik) + (u.licznik * this.mianownik);
           int mian = this.mianownik * u.mianownik;
           System.out.println(licz + "/" + mian);
        } else {
            int licz = this.licznik + u.licznik;
            int mian = this.mianownik;
            System.out.println(licz + "/" + mian);
        }
    }

    public void odejmowanie(Ulamek u) {
        if(this.mianownik != u.mianownik) {
            int licz = (this.licznik * u.mianownik) - (u.licznik * this.mianownik);
            int mian = this.mianownik * u.mianownik;
            System.out.println(licz + "/" + mian);
        } else {
            int licz = this.licznik - u.licznik;
            int mian = this.mianownik;
            System.out.println(licz + "/" + mian);
        }
    }

    public void mnozenie(Ulamek u) {
        int licz = this.licznik * u.licznik;
        int mian = this.mianownik * u.mianownik;
        System.out.println(licz + "/" + mian);
    }

    public void dzielenie(Ulamek u) {
        int licz = this.licznik * u.mianownik;
        int mian = this.mianownik * u.licznik;
        System.out.println(licz + "/" + mian);
    }

    public void wyswietl() {
        System.out.println(licznik + "/" + mianownik);
    }


}
