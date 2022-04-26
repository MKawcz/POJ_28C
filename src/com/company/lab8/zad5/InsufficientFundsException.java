package com.company.lab8.zad5;

public class InsufficientFundsException extends Exception {
    @Override
    public String getMessage() {
        return "Niewystarczajaca ilosc srodkow na koncie.\n";
    }
}
