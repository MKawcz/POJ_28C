package com.company.uzupełniające1;

public enum StrzelnicaBron {
    PISTOLET(1.3),
    KARABIN(1.5),
    REWOLWER(1.2);

    double celnosc;

    StrzelnicaBron(double celnosc) {
        this.celnosc = celnosc;
    }

    public double getCelnosc() {
        return celnosc;
    }
}
