package lab6;

public class Samochod extends Pojazd {
    private String silnik;

    public Samochod(int liczbaKol, String kolor, String dzwiek, String silnik) {
        super(liczbaKol, kolor, dzwiek);
        this.silnik = silnik;
    }

    @Override
    public void informacje() {
        super.informacje();
        System.out.printf(", silnik: %s", silnik);
    }
}
