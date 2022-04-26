package com.company.lab8;

public class Wyjatek {
    public static void main(String[] args) {
        try{
            int a = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("koniec try-catch");
        }

        System.out.println("Test");
    }
}
