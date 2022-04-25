package com.company.lab7.zad3;


import com.company.lab7.zad3.paymentMethods.CreditCard;
import com.company.lab7.zad3.paymentMethods.PaymentMethod;
import com.company.lab7.zad3.paymentMethods.Wallet;
import com.company.lab7.zad3.products.Product;

import java.util.Random;

public class VendingMachine {
    private Product[] products;
    private Product currentProduct;
    private Product paidProduct;
    private boolean waitingForPayment;


    public VendingMachine(Product[] products) {
        this.products = products;
    }

    public void chooseProduct(int code) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product.getCode() == code && product.getAmount() > 0) {
                currentProduct = product;
                waitingForPayment = true;
                System.out.println("Pik pik, pay for your product!");
                break;
            }
        }
    }

    public void payWithCard(CreditCard card, String pin) {
        if (card.checkPin(pin)) {
            pay(card);
        } else {
            System.out.println("Pin incorrect");
        }
    }

    public void payWithCash(Wallet wallet) {
        pay(wallet);
    }

    private void pay(PaymentMethod method) {
        if (waitingForPayment) {
            if (method.reduceFunds(currentProduct.getPrice())) {
                this.prepareProduct(currentProduct);
            } else {
                System.out.println("Transaction error");
            }
            this.currentProduct = null;
            this.waitingForPayment = false;
        }
    }

    private void prepareProduct(Product currentProduct) {
        currentProduct.setAmount(currentProduct.getAmount() - 1);
        this.paidProduct = currentProduct;
        System.out.println("Clang clang, piiik!");
    }

    public Product takeProduct() {
        if (paidProduct != null) {
            Random random = new Random();
            Product product = paidProduct;
            this.paidProduct = null;
            int zaciecie = random.nextInt(5);
            if(zaciecie == 1) {
                System.out.println("The machine is stuck :(");
                shakeTheMachine();
                return product;
            } else {
                return product;
            }
        } else {
            System.out.println("The chamber is empty");
            return null;
        }
    }

    public void shakeTheMachine(){
        Random random = new Random();
        int odciecie = random.nextInt(2);
        while(odciecie != 1){
            System.out.println("*shaking*");
            System.out.println("Unfortunately, the machine is still stuck :(");
            odciecie = random.nextInt(2);
        }
        System.out.println("*shaking*");
        System.out.println("The machine is working again!");
    }

}
