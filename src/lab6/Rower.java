package lab6;

public class Rower extends Pojazd {
    private String rodzaj;

    public Rower(int liczbaKol, String kolor, String dzwiek, String rodzaj) {
        super(liczbaKol, kolor, dzwiek);
        this.rodzaj = rodzaj;
    }

    @Override
    public void informacje() {
        super.informacje();
        System.out.printf(", rodzaj: %s", rodzaj);
    }
}
