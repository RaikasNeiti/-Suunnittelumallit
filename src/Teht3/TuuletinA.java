package Teht3;

public class TuuletinA implements Tuuletin{

    private int hinta = 15;
    @Override
    public void lisääKomponentti(Komponentti komponentti) {
        throw new RuntimeException("tähän komponentiin ei voi lisätä muita komponentejä");
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
