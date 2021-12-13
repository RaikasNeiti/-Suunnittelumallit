package Teht5;

public class Main {
    public static void main(String[] args){
        Tyontekija tyontekija = new Tyontekija();

        //Tämän singeltonin voi aktivoida mistä tahansa luokasta. Ei tarvitse enään initialisoida tai tehdä uutta työntekijä muuttujaa.
        SingletonTyontekija.setIntance(tyontekija);


        System.out.println("Työntekijän Etunimi on " + SingletonTyontekija.getInstance().getTyontekija().getEtunimi());
        System.out.println("Työntekijän Sukunimi on " +SingletonTyontekija.getInstance().getTyontekija().getSukunimi());


    }
}
