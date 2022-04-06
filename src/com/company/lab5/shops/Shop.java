package com.company.lab5.shops;

public class Shop {
    protected String address;
    protected int size;

    public void getInformation(){
        System.out.printf("Adres sklepu to: %s, jego powierzchnia to %d\n", address, size);
    }

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }
}
