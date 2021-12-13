package Teht10;

public class Esimies extends Palkankorotus{

    public Esimies(Palkankorotus esimies){
        super(esimies);
    }

    @Override
    public boolean käsittelePalkankorotus(double korotus) {
        if(korotus <= 2){
            System.out.println("Esimies hyväksyi palkankorouksen");
            return true;
        }else {
            System.out.println("Esimies lähetti palkankorotuksen Päälikkölle");
            return super.käsittelePalkankorotus(korotus);
        }
    }
}
