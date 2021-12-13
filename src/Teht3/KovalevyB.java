package Teht3;

public class KovalevyB implements Kovalevy{

    private int hinta = 75;
    @Override
    public void lisääKomponentti(Komponentti komponentti) {
        throw new RuntimeException("tähän komponentiin ei voi lisätä muita komponentejä");
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
