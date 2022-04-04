package com.company.uzupełniające1;

public class Gracz {
    private int punktyZycia;
    Bron bron;
    Zbroja zbroja;
    Przeciwnik przeciwnik;

    public void setPunktyZycia(int punktyZycia) {
        this.punktyZycia = punktyZycia;
    }

    public void setBron(Bron bron) {
        this.bron = bron;
    }

    public void setZbroja(Zbroja zbroja) {
        this.zbroja = zbroja;
    }

    public void setPrzeciwnik(Przeciwnik przeciwnik) {
        this.przeciwnik = przeciwnik;
    }

    public void graj(){
        int wynikGracza = punktyZycia + zbroja.getWytrzymalosc();
        int wynikPrzeciwnika = przeciwnik.getPunktyZycia() + przeciwnik.zbroja.getWytrzymalosc();
        int a = 0;
        System.out.println("WITAJ DZIELNY GRACZU! CZY DASZ RADĘ POKONAC SWOJEGO PRZECIWNIKA? ...");
        System.out.println("NIECH ROZPOCZNIE SIĘ WALKA!");
        while (wynikGracza > 0 && wynikPrzeciwnika > 0){
            if(a % 2 == 0){
                System.out.println("Gracz wyprowadza cios " + bron.getNazwa() + "...");
                wynikPrzeciwnika = wynikPrzeciwnika- bron.getObrazenia();
                System.out.println("Przeciwnikowi pozostało: " + wynikPrzeciwnika + " punktów życia...");

            } else {
                System.out.println("Przeciwnik wyprowadza cios " + przeciwnik.bron.getNazwa() + "...");
                wynikGracza = wynikGracza - przeciwnik.bron.getObrazenia();
                System.out.println("Graczowi pozostało: " + wynikGracza + " punktów życia...");

            }

            a++;
        }

        if(wynikGracza <= 0){
            System.out.println("Niestety... Doświadczyłeś porażki...");
        } else if(wynikPrzeciwnika <= 0){
            System.out.println("Gratulacje! Odniosłeś zwycięstwo!");
        }
    }

}
