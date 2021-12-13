package Teht11;

import java.util.Random;

public class Arvaaja extends Thread{

    private Object vastaus;
    private Arvattava arvattava;
    private Random random;
    private static int i = 1;
    private String nimi;

    public Arvaaja(Arvattava arvattava){
        this.arvattava = arvattava;
        vastaus = arvattava.liityPeliin();
        random = new Random();
        nimi = "Arvaaja " + i++;

    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int arvaus = random.nextInt(11);
            if(arvattava.tarkistaArvaus(vastaus, arvaus)){
                System.out.println(nimi + " arvasi oikein (" + arvaus + ")");
                return;
            }
            System.out.println(nimi + " arvasi väärin (" + arvaus + ")");


        }
    }
}
