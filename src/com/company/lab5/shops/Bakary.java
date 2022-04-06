package com.company.lab5.shops;

public class Bakary extends Shop {

    public Bakary(String address, int size) {
        super(address, size);
    }

    String[] products = {"Chleb pradawny", "Kazjzerka", "Drożdżówka"};

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Dostępne produkty: ");
        for(String i : products) {
            System.out.println(i);
        }
    }

}
