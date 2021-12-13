package Teht3;

public class CPU_B implements CPU{

    private int hinta = 450;

    @Override
    public void lisääKomponentti(Komponentti komponentti) {
        throw new RuntimeException("tähän komponentiin ei voi lisätä muita komponentejä");
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
