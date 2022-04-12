package lab6;

public class MainZad1 {
    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd(4, "niebieski", "wruum");
        Samochod samochod = new Samochod(4, "czarny", "bruum", "disel");
        Rower rower = new Rower(2, "biały", "siuu", "górski");

        Pojazd[] pojazdy = {pojazd, samochod, rower};

        for (Pojazd i: pojazdy) {
            i.informacje();
            System.out.printf("\n");
        }
    }
}
