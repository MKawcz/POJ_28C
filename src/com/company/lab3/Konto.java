package com.company.lab3;

public class Konto {
    int id;
    int money;

    public Konto(int id, int money) {
        this.id = id;
        this.money = money;
    }

    public void check_money() {
        System.out.printf("ilość pieniedzy na koncie: %d\n", money);
    }

    public int deposit(int d) {
        money = money + d;
        return money;
    }

    public int pay_out(int d) {
        money = money - d;
        return money;
    }

}
