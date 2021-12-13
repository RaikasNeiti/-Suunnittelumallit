package Teht3;

import java.util.ArrayList;

public class KoteloB implements Kotelo{

    private int hinta = 135;

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
