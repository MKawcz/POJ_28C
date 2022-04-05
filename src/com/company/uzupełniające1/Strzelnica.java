package com.company.uzupełniające1;

import java.util.Random;

public class Strzelnica {
    public static void main(String[] args) {
        graj();
    }


    public static void graj() {
        int a = 1;
        double d = 0;
        Random rand = new Random();
        int trafioneCeleStrzelca1 = 0;
        int trafioneCeleStrzelca2 = 0;
        int trafioneCeleStrzelca3 = 0;
        double procTrafienStrzelca1 = 0.0;
        double procTrafienStrzelca2 = 0.0;
        double procTrafienStrzelca3 = 0.0;

            while (a <= 10) {
                if (a <= 5) {

                    System.out.println("Cel nr: " + a);
                    System.out.println("80% szans na trafienie");

                    d = rand.nextDouble() * (1.9 - 1) + 1;
                    if((Strzelec.STRZELEC1.getStrzelnicaBron().getCelnosc() / Cele.PIERWSZEPIECCELOW.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + " Trafił!");
                        trafioneCeleStrzelca1++;
                        procTrafienStrzelca1 = (procTrafienStrzelca1 + 1) * Cele.PIERWSZEPIECCELOW.getSzansa();
                    } else {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + " NIE trafił!");
                    }

                    d = rand.nextDouble() * (1.9 - 1) + 1;
                    if((Strzelec.STRZELEC2.getStrzelnicaBron().getCelnosc() / Cele.PIERWSZEPIECCELOW.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + " Trafił!");
                        trafioneCeleStrzelca2++;
                        procTrafienStrzelca2 = (procTrafienStrzelca2 + 1) * Cele.PIERWSZEPIECCELOW.getSzansa();
                    } else {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + " NIE trafił!");
                    }

                    d = rand.nextDouble() * (1.9 - 1) + 1;
                    if((Strzelec.STRZELEC3.getStrzelnicaBron().getCelnosc() / Cele.PIERWSZEPIECCELOW.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + " Trafił!");
                        trafioneCeleStrzelca3++;
                        procTrafienStrzelca3 = (procTrafienStrzelca3 + 1) * Cele.PIERWSZEPIECCELOW.getSzansa();
                    } else {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + " NIE trafił!");
                    }

                } else if(a > 5 && a <= 8) {

                    System.out.println("Cel nr: " + a);
                    System.out.println("60% szans na trafienie");

                    d = rand.nextDouble() * (1.9 - 1) + 1;
                    if((Strzelec.STRZELEC1.getStrzelnicaBron().getCelnosc() / Cele.KOLEJNETRZYCELE.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + " Trafił!");
                        trafioneCeleStrzelca1++;
                        procTrafienStrzelca1 = (procTrafienStrzelca1 + 1) * Cele.KOLEJNETRZYCELE.getSzansa();
                    } else {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + " NIE trafił!");
                    }

                    d = rand.nextDouble() * (1.9 - 1) + 1;
                    if((Strzelec.STRZELEC2.getStrzelnicaBron().getCelnosc() / Cele.KOLEJNETRZYCELE.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + " Trafił!");
                        trafioneCeleStrzelca2++;
                        procTrafienStrzelca2 = (procTrafienStrzelca2 + 1) * Cele.KOLEJNETRZYCELE.getSzansa();
                    } else {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + " NIE trafił!");
                    }

                    d = rand.nextDouble() * (1.9 - 1) + 1;
                    if((Strzelec.STRZELEC3.getStrzelnicaBron().getCelnosc() / Cele.KOLEJNETRZYCELE.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + " Trafił!");
                        trafioneCeleStrzelca3++;
                        procTrafienStrzelca3 = (procTrafienStrzelca3 + 1) * Cele.KOLEJNETRZYCELE.getSzansa();
                    } else {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + " NIE trafił!");
                    }

                } else if(a > 8 && a <= 10) {

                    System.out.println("Cel nr: " + a);
                    System.out.println("40% szans na trafienie");

                    d = rand.nextDouble() * (1.9 - 1) + 1;
                    if((Strzelec.STRZELEC1.getStrzelnicaBron().getCelnosc() / Cele.OSTATNIEDWA.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + " Trafił!");
                        trafioneCeleStrzelca1++;
                        procTrafienStrzelca1 = (procTrafienStrzelca1 + 1) * Cele.OSTATNIEDWA.getSzansa();
                    } else {
                        System.out.println(Strzelec.STRZELEC1.getNazwa() + " NIE trafił!");
                    }

                    d = rand.nextDouble() * (1.9 - 1) + 1;
                    if((Strzelec.STRZELEC2.getStrzelnicaBron().getCelnosc() / Cele.OSTATNIEDWA.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + " Trafił!");
                        trafioneCeleStrzelca2++;
                        procTrafienStrzelca2 = (procTrafienStrzelca2 + 1) * Cele.OSTATNIEDWA.getSzansa();
                    } else {
                        System.out.println(Strzelec.STRZELEC2.getNazwa() + " NIE trafił!");
                    }

                    d = rand.nextDouble() * (1.9 - 1) + 1;
                    if((Strzelec.STRZELEC3.getStrzelnicaBron().getCelnosc() / Cele.OSTATNIEDWA.getSzansa()) - d >= 1) {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + " Trafił!");
                        trafioneCeleStrzelca3++;
                        procTrafienStrzelca3 = (procTrafienStrzelca3 + 1) * Cele.OSTATNIEDWA.getSzansa();
                    } else {
                        System.out.println(Strzelec.STRZELEC3.getNazwa() + " NIE trafił!");
                    }
                }

                a++;
            }

            if (a == 11){
                System.out.println("Koniec rozgrywki!");
                System.out.println(Strzelec.STRZELEC1.getNazwa() + " trafił " + trafioneCeleStrzelca1 + " celów!");
                System.out.println("Jego procent trafień to: " + procTrafienStrzelca1 * 100+ "%");
                System.out.println(Strzelec.STRZELEC2.getNazwa() + " trafił " + trafioneCeleStrzelca2 + " celów!");
                System.out.println("Jego procent trafień to: " + procTrafienStrzelca2 * 100+ "%");
                System.out.println(Strzelec.STRZELEC3.getNazwa() + " trafił " + trafioneCeleStrzelca3 + " celów!");
                System.out.println("Jego procent trafień to: " + procTrafienStrzelca3 * 100 + "%");

                if(procTrafienStrzelca1 > procTrafienStrzelca2 && procTrafienStrzelca1 > procTrafienStrzelca3){
                    System.out.println("Zwyciężył " + Strzelec.STRZELEC1.getNazwa());
                } else if(procTrafienStrzelca2 > procTrafienStrzelca1 && procTrafienStrzelca2 > procTrafienStrzelca3){
                    System.out.println("Zwyciężył " + Strzelec.STRZELEC2.getNazwa());
                } else if(procTrafienStrzelca3 > procTrafienStrzelca2 && procTrafienStrzelca3 > procTrafienStrzelca1){
                    System.out.println("Zwyciężył " + Strzelec.STRZELEC3.getNazwa());
                } else{
                    System.out.println("REMIS!!!");
                }

            }

    }
}