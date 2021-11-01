public abstract class AterioivaOtus {

    Juoma juoma = null;
    Juoma juoma2 = null;
    Juoma viini = null;

    public abstract Juoma createJuoma();

    public abstract Juoma uusiJuoma();

    public abstract Juoma createViini();

    public void aterioi(){
        syö();
        juo();
        viini();
    }

    public void syö(){
        System.out.println("Kylläpä ruoka maistuukin hyvältä");
    }


    public void juo(){
        if (juoma == null) {
            juoma = createJuoma();
            juoma2 = uusiJuoma();
        }
        System.out.println("Aterian jälkeen " + juoma + " ja " + juoma2 +" tekee terää");
    }

    public void viini(){
        if (viini == null){
            viini = createViini();
        }
        System.out.println("Jäkiruuan kanssa on hyvä ottaa "+ viini);
    }
}
