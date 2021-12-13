package Teht10;

public class Työntekijä extends Palkankorotus{

    public Työntekijä(Palkankorotus esimies){
        super(esimies);
    }

    public void pyydäPalkankorotusta(double korotus){
        if(super.käsittelePalkankorotus(korotus)){
            System.out.println("Sain palkankortuksen!");
        }else{
            System.out.println("Palkankorotus pyyntöni hylättiin");
        }
    }
}
