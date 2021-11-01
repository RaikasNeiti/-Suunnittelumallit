public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){return new Vesi();};


    public Juoma uusiJuoma(){return new CocaCola();}

    public Juoma createViini(){return new Viini();}

}
