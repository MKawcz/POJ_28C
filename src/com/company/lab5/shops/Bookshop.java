package com.company.lab5.shops;

public class Bookshop extends Shop {

    public Bookshop(String address, int size) {
        super(address, size);
    }

    String[] products = {"Biografia Elona Muska", "Lalka", "Diuna"};

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Dostępne produkty: ");
        for(String i : products) {
            System.out.println(i);
        }
    }


}
