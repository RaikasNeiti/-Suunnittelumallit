package Teht10;

public abstract class Palkankorotus {

    private Palkankorotus esimies;

    public Palkankorotus(Palkankorotus esimies){
        this.esimies = esimies;
    }

    public boolean k√§sittelePalkankorotus(double korotus){
        return esimies.k√§sittelePalkankorotus(korotus);
    }

}
