package Teht3;

import java.util.ArrayList;

public class EmolevyB implements Emolevy{

    private int hinta = 175;
    ArrayList<Komponentti> lista = new ArrayList<>();
    @Override
    public void lisääKomponentti(Komponentti komponentti) {
        lista.add(komponentti);
    }

    @Override
    public int getHinta() {
        int x = hinta;
        for(Komponentti k : lista){
            x+=k.getHinta();
        }
        return x;
    }
}
