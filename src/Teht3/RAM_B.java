package Teht3;

public class RAM_B implements RAM{

    private int hinta = 160;
    @Override
    public void lisääKomponentti(Komponentti komponentti) {
        throw new RuntimeException("tähän komponentiin ei voi lisätä muita komponentejä");
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
