package Teht11;

import java.util.Random;

public class Arvattava {

    private Random random;

    public Arvattava(){
        random = new Random();
    }

    public int arvoNumero(){
        return random.nextInt(10) + 1;
    }

    public Object liityPeliin(){
        return new Memento(arvoNumero());
    }

    public boolean tarkistaArvaus(Object vastaus, int arvaus){
        Memento memento = (Memento) vastaus;
        if(memento.vastaus == arvaus){
            return true;
        }
        return false;
    }
    private class Memento{
        private int vastaus;
        private Memento(int vastaus){
            this.vastaus = vastaus;
        }


    }
}
