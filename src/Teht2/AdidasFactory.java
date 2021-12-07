package Teht2;

public class AdidasFactory extends AbstractFactory{


    @Override
    protected Lippis makeLippis() {
        return new AdidasLippis();
    }

    @Override
    protected Farmari makeFarmari() {
        return new AdidasFarmari();
    }

    @Override
    protected T_Paita makeT_Paita() {
        return new AdidasT_Paita();
    }

    @Override
    protected Kengät makeKengät() {
        return new AdidasKengät();
    }
}
