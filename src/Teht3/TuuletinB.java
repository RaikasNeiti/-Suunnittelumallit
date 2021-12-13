package Teht3;

public class TuuletinB implements Tuuletin{

    private int hinta = 20;
    @Override
    public void lisääKomponentti(Komponentti komponentti) {
        throw new RuntimeException("tähän komponentiin ei voi lisätä muita komponentejä");
    }

    @Override
    public int getHinta() {return hinta;}
}
