package com.company.lab7.zad3;


import com.company.lab7.zad3.paymentMethods.CreditCard;
import com.company.lab7.zad3.paymentMethods.Wallet;
import com.company.lab7.zad3.products.Drink;
import com.company.lab7.zad3.products.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* CreditCard card = new CreditCard(300, "1234");
        Drink fanta = new Drink("Fanta", 3.50, 12, 3, true);
        Product[] products = {fanta};


        vendingMachine.chooseProduct(12);
        vendingMachine.payWithCard(card, "1234");
        Product product = vendingMachine.takeProduct();

        if(product != null)
        System.out.println(product.info());
        System.out.println(card.getFunds());*/

        CreditCard card = new CreditCard(300, "1234");
        Wallet wallet = new Wallet(200);
        Drink fanta = new Drink("Fanta", 3.50, 12, 3, true);
        Drink pepsi = new Drink("Pepsi", 3.00, 13, 5,true);
        Drink cisowianka = new Drink("Cisowianka", 2.50, 14, 7,false);
        Drink monster = new Drink("monster", 5.00, 15, 4,true);
        Product[] products = {fanta, pepsi, cisowianka, monster};
        VendingMachine vendingMachine = new VendingMachine(products);
        boolean czySkonczyles = false;
        Scanner scanner = new Scanner(System.in);
        boolean czyPrawidolowyNumer = false;
        while (!czySkonczyles){
            for (Product p: products) {
                System.out.println(p.getName() + " number: " + p.getCode() + ", price: " + p.getPrice());
            }
            System.out.println("Hello, choose number of your product: ");
            int number = scanner.nextInt();

            while (!czyPrawidolowyNumer) {
                if (number >= 12 && number <= 15) {
                    vendingMachine.chooseProduct(number);
                    czyPrawidolowyNumer = true;
                } else {
                    System.out.println("Wrong number! Type nuber of your product again: ");
                    number = scanner.nextInt();
                }
            }
            System.out.println("Choose your payment method: ");
            System.out.println("If you want to pay with card - press 1, cash - press 2: ");
            int cardOrCash = scanner.nextInt();

            if (cardOrCash == 1) {
                System.out.println("Type your pin: ");
                String pin = scanner.next();
                vendingMachine.payWithCard(card, pin);
                System.out.println(card.getFunds());
            } else if (cardOrCash == 2) {
                vendingMachine.payWithCash(wallet);
                System.out.println(wallet.getFunds());
            }

            Product product = vendingMachine.takeProduct();

            if(product != null) {
                System.out.println(product.info());
            }


            System.out.println("Do you want to buy something more?");
            System.out.println("Yes - press 1, No - press 2: ");
            int czyChceWiecej = scanner.nextInt();

                if (czyChceWiecej == 1) {
                    czySkonczyles = false;
                } else if (czyChceWiecej == 2) {
                    czySkonczyles = true;
                } else {
                    System.out.println("Wrong number!");
                    czySkonczyles = true;
                }

        }
    }
}
