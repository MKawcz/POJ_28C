package com.company.lab4;

public class Wyscig {
    public static void main(String[] args) {
        Zawodnik zawodnik1 = new Zawodnik("Michał",5, 16);
        Zawodnik zawodnik2 = new Zawodnik("Mikołaj",3, 11);
        Zawodnik zawodnik3 = new Zawodnik("Maciej",2, 13);

        boolean bieg = false;

        while(bieg == false) {
            zawodnik1.biegnij();
            zawodnik2.biegnij();
            zawodnik3.biegnij();

            if(zawodnik1.getDistance() >= 50) {
                zawodnik1.przedstawSie();
                bieg = true;
            } else if (zawodnik2.getDistance() >= 50){
                zawodnik2.przedstawSie();
                bieg = true;
            } else if (zawodnik3.getDistance() >= 50) {
                zawodnik3.przedstawSie();
                bieg = true;
            }
        }
    }
}
