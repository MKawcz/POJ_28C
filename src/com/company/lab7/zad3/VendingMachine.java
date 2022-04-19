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
    private Product jammedProduct;
    private int counter = 0;

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
            Product product = paidProduct;
            this.paidProduct = null;
            counter++;
            if(counter % 5 == 0) {
                jammedProduct = product;
                System.out.println("Maszyna się zacięła :(");
                return null;
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
        if(odciecie == 1){
            System.out.println("Udało się odciąć maszynę!");
            takeProduct();
        } else {
            System.out.println("Niestety, maszyna jest wciąż zacięta :(");
        }
    }
}
