package com.company.lab4;

import java.util.Random;

public class Zawodnik {
    private String name;
    private int minSpeed;
    private int maxSpeed;
    private int distance;

    public Zawodnik(String name, int minSpeed, int maxSpeed) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.distance = 0;
    }

    public void przedstawSie() {
        System.out.printf("Jestem %s, biegam z prędkością %d - %dkm/h\n", name, minSpeed, maxSpeed);
    }

    public void biegnij() {
        Random random = new Random();
        this.distance += random.nextInt(maxSpeed * 5);
        if(this.distance < 5) {
            this.distance += random.nextInt(maxSpeed * 5);
        }
    }

    public double getDistance() {
        return distance;
    }


}
