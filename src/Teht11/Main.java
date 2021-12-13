package Teht11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Arvattava arvattava = new Arvattava();
        int pelaajat = 3;
        List<Arvaaja> arvaajat = new ArrayList<>();

        for(int i = 0; i < pelaajat; i++){
            Arvaaja arvaaja = new Arvaaja(arvattava);
            arvaaja.start();
            arvaajat.add(arvaaja);
        }

        for(int i = 0; i < pelaajat; i++){
            try {
                arvaajat.get(i).join();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("Kaikki pelaajat arvasivat oikein");
    }
}
