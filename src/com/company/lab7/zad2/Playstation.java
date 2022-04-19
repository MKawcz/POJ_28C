package com.company.lab7.zad2;

public class Playstation extends GameConsole{
    @Override
    public void playGame(Game game) {
        if(game.type == TypeOfGames.PLAYSTATION){
            System.out.println("Miłej rozgrywki");
        } else {
            System.out.println("Nie możesz zagrać w tą grę");
        }
    }
}
