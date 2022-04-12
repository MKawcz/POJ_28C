package lab6;

public class Dog {
    public void szczekaj(){
        System.out.println("Hau");
    }
    public void szczekaj(int ileRazy){
        for (int i = 0; i < ileRazy; i++) {
            System.out.println("Hau");
        }
        if(ileRazy <= 0) {
            System.out.println("Tyle razy nie szczeknę :(");
        }
    }
}
