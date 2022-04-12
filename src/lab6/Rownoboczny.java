package lab6;

public class Rownoboczny extends Trojkat {

    public double obliczPole(){
        return (a * a * Math.sqrt(3)) / 4;
    }

    public Rownoboczny(int a) {
        this.a = a;
        h = 0;
    }
}
