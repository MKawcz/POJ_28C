package com.company.uzupełniające1;

import java.util.Random;

public class Strzelnica {

    public void graj() {
       /* int trafstrzelca1;
        int trafstrzelca2;
        int trafstrzelca3;*/
        int a = 0;
        double d = 0;
        Random rand = new Random();

            while (a < 10) {
                if (a < 5) {
                    d = rand.nextDouble() * 0.5;
                    System.out.println("Cel nr: " + a);
                    System.out.println(Cele.PIERWSZEPIECCELOW.getSzansa() + "% szans na trafienie");
                    if((Strzelec.STRZELEC1.getStrzelnicaBron().getCelnosc() * Cele.PIERWSZEPIECCELOW.getSzansa()) - x >= 1) {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + "Trafił!");
                    } else {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + "NIE trafił!");
                    }

                    if((Strzelec.STRZELEC2.getStrzelnicaBron().getCelnosc() * Cele.PIERWSZEPIECCELOW.getSzansa()) - x >= 1) {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + "Trafił!");
                    } else {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + "NIE trafił!");
                    }

                    if((Strzelec.STRZELEC3.getStrzelnicaBron().getCelnosc() * Cele.PIERWSZEPIECCELOW.getSzansa()) - x >= 1) {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + "Trafił!");
                    } else {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + "NIE trafił!");
                    }

                } else if(a > 4 && a < 8) {
                    d = rand.nextDouble() * 0.5;

                    System.out.println("Cel nr: " + a);
                    System.out.println(Cele.KOLEJNETRZYCELE.getSzansa() + "% szans na trafienie");

                    if((Strzelec.STRZELEC1.getStrzelnicaBron().getCelnosc() * Cele.KOLEJNETRZYCELE.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + "Trafił!");
                    } else {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + "NIE trafił!");
                    }

                    if((Strzelec.STRZELEC2.getStrzelnicaBron().getCelnosc() * Cele.KOLEJNETRZYCELE.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + "Trafił!");
                    } else {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + "NIE trafił!");
                    }

                    if((Strzelec.STRZELEC3.getStrzelnicaBron().getCelnosc() * Cele.KOLEJNETRZYCELE.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + "Trafił!");
                    } else {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + "NIE trafił!");
                    }

                } else if(a > 7 && a < 10) {
                    d = rand.nextDouble() * 0.5;
                    System.out.println("Cel nr: " + a);
                    System.out.println(Cele.OSTATNIEDWA.getSzansa() + "% szans na trafienie");

                    if((Strzelec.STRZELEC1.getStrzelnicaBron().getCelnosc() * Cele.OSTATNIEDWA.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + "Trafił!");
                    } else {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + "NIE trafił!");
                    }

                    if((Strzelec.STRZELEC2.getStrzelnicaBron().getCelnosc() * Cele.OSTATNIEDWA.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + "Trafił!");
                    } else {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + "NIE trafił!");
                    }

                    if((Strzelec.STRZELEC3.getStrzelnicaBron().getCelnosc() * Cele.OSTATNIEDWA.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + "Trafił!");
                    } else {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + "NIE trafił!");
                    }
                }

                a++;
            }

            if (a > 10){
                System.out.println("Koniec rozgrywki!");
            }

    }
}