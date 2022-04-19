package com.company.lab7.zad2;

public class Main {
    public static void main(String[] args) {
        Playstation playstation = new Playstation();
        Xbox xbox = new Xbox();
        PlaystationGame playstationGame = new PlaystationGame();
        XboxGame xboxGame = new XboxGame();

        playstation.playGame(playstationGame);
        playstation.playGame(xboxGame);
        xbox.playGame(xboxGame);
        xbox.playGame(playstationGame);
    }
}
