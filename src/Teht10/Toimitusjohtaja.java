package Teht10;

public class Toimitusjohtaja extends Palkankorotus{

    public Toimitusjohtaja(Palkankorotus esimies){
        super(esimies);
    }

    @Override
    public boolean käsittelePalkankorotus(double korotus) {
        if(korotus <= 7){
            System.out.println("Toimitusjohtaja hyväksyi palkankorotuksen");
            return true;
        }else {
            System.out.println("Toimitusjohtaja hylkäsi palkankorotuksen");
            return false;
        }
    }
}
