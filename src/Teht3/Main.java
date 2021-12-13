package Teht3;

public class Main {

    public static void main(String[] args) {
       AbstractFactory factory;
       String string;

       for(int i = 0; i < 2 ; i++) {

          if(i == 0){
             factory = new FactoryA();
             string = "A";
          }else{
             factory= new FactoryB();
             string = "B";
          }
          Komponentti kotelo = factory.makeKotelo();
          kotelo.lisääKomponentti(factory.makeTuuletin());
          kotelo.lisääKomponentti(factory.makeTuuletin());
          Komponentti emolevy = factory.makeEmolevy();
          kotelo.lisääKomponentti(emolevy);
          emolevy.lisääKomponentti(factory.makeGrafiikkakortti());
          emolevy.lisääKomponentti(factory.makeCpu());
          emolevy.lisääKomponentti(factory.makeKovalevy());
          emolevy.lisääKomponentti(factory.makeRAM());
          System.out.println("Koneen " +string + " hinta: " + kotelo.getHinta());

       }

    }
}
