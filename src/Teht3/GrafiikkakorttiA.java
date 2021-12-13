package Teht3;

public class GrafiikkakorttiA implements Grafiikkakortti{

    private int hinta = 450;
    @Override
    public void lisääKomponentti(Komponentti komponentti) {
        throw new RuntimeException("tähän komponentiin ei voi lisätä muita komponentejä");
    }

    @Override
    public int getHinta() {return hinta;}
}
