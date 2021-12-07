package Teht2;

public abstract class JavaKoodaja {

    Lippis lippis;
    Kengät kengät;
    Farmari farmari;
    T_Paita t_paita;

    public void pueVaatteet(AbstractFactory factory){
        kengät = factory.makeKengät();
        lippis = factory.makeLippis();
        farmari = factory.makeFarmari();
        t_paita = factory.makeT_Paita();
    }

    public String toString() {
        return "lippis on " + lippis +
                "\nkengät on " + kengät +
                "\nfarmari on " + farmari +
                "\nt_paita on " + t_paita;

    }

}
