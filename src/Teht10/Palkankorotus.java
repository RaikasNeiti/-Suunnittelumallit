package Teht10;

public abstract class Palkankorotus {

    private Palkankorotus esimies;

    public Palkankorotus(Palkankorotus esimies){
        this.esimies = esimies;
    }

    public boolean käsittelePalkankorotus(double korotus){
        return esimies.käsittelePalkankorotus(korotus);
    }

}
