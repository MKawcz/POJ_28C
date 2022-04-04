package com.company.uzupełniające1;

public enum Strzelec {
    STRZELEC1("Strzelec 1",StrzelnicaBron.PISTOLET),
    STRZELEC2("Strzelec 2",StrzelnicaBron.REWOLWER),
    STRZELEC3("Strzelec 3",StrzelnicaBron.KARABIN);

    private String nazwa;
    StrzelnicaBron strzelnicaBron;

    Strzelec(String nazwa, StrzelnicaBron strzelnicaBron) {
        this.nazwa = nazwa;
        this.strzelnicaBron = strzelnicaBron;
    }

    public StrzelnicaBron getStrzelnicaBron() {
        return strzelnicaBron;
    }

    public String getNazwa() {
        return nazwa;
    }
}
