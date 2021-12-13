package Teht10;

public class Päälikkö extends Palkankorotus{

    public Päälikkö(Palkankorotus esimies){
        super(esimies);
    }

    @Override
    public boolean käsittelePalkankorotus(double korotus) {
        if(korotus <= 5){
            System.out.println("Päälikkö hyväksyi palkankorouksen");
            return true;
        }else {
            System.out.println("Päälikkö lähetti palkankorotuksen toimitusjohtajalle");
            return super.käsittelePalkankorotus(korotus);
        }
    }
}
