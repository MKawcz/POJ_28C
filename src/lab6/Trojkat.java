package lab6;

public class Trojkat {
    protected int a;
    protected int h;

    public Trojkat() {
        a = 1;
        h = 2;
    }

    public Trojkat(int h) {
        this();
        this.h = h;
    }

    public double obliczPole(){
        return (a * h) / 2.0;
    }
}
