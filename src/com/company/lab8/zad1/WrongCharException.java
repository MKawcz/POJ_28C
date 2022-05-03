package com.company.lab8.zad1;

public class WrongCharException extends Exception{
    @Override
    public String getMessage() {
        return "Podano niepoprawny znak. Proszę, wpisz znak jescze raz: \n";
    }
}
