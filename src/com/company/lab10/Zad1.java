package com.company.lab10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - 'dd-MM-yyyy'\n" +
                "2 - 'MM/dd/yyyy hh:mm a'\n" +
                "3 - 'EEEE, MMM dd, yyyy HH:mm:ss a'\n" +
                "4 - 'h:mm a'\n" +
                "Wybierz format wyświetlenia daty:\n");
        String format = scanner.nextLine();
        switch (format) {
            case "1" -> {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedDate= now.format(formatter);
                System.out.println(formattedDate);
            }
            case "2" -> {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
                String formattedDate= now.format(formatter);
                System.out.println(formattedDate);
            }
            case "3" -> {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a");
                String formattedDate= now.format(formatter);
                System.out.println(formattedDate);
            }
            case "4" -> {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
                String formattedDate= now.format(formatter);
                System.out.println(formattedDate);
            }
            default -> System.out.println("Wprowadzono błędny znak");
        }

    }
}
