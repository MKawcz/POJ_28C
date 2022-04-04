package com.company.uzupełniające1;

public class Reverse {
    public static void main(String[] args) {
        String slowo = "siema";
        rev(slowo);
    }

    public static void rev(String word){
        for (int i = word.length() - 1; i >= 0; i--){
            System.out.printf("%c", word.charAt(i));
        }
    }
}
