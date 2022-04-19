package com.company.lab7.zad2;

public class Xbox extends GameConsole{
    @Override
    public void playGame(Game game) {
        if(game.type == TypeOfGames.XBOX){
            System.out.println("Miłej rozgrywki");
        } else {
            System.out.println("Nie możesz zagrać w tą grę");
        }
    }
}
