package lab6;

public class Pojazd {
    protected int liczbaKol;
    protected String kolor;
    protected String dzwiek;

    public Pojazd(int liczbaKol, String kolor, String dzwiek) {
        this.liczbaKol = liczbaKol;
        this.kolor = kolor;
        this.dzwiek = dzwiek;
    }

    public void informacje(){
        System.out.printf("Liczba kół: %d, kolor: %s, dźwięk: %s", liczbaKol, kolor, dzwiek);
    }
}
