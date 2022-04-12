package lab6;

public class Produkt {
    private String nazwa;
    private int cena;
    private int ilosc;

    public Produkt(String nazwa, int cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "| Nazwa | Cena | Ilość |\n ______________________\n| "
                + nazwa + " |  " + cena + "   |   " + ilosc + "   |\n ______________________";
    }
}
