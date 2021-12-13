package Teht10;

public class Main {

    public static void main(String[] args) {

        Työntekijä työntekijä = new Työntekijä(new Esimies(new Päälikkö(new Toimitusjohtaja(null))));

        työntekijä.pyydäPalkankorotusta(8);
    }
}
