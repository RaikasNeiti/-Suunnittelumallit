package Teht2;

public class BossFactory extends AbstractFactory{
    @Override
    protected Lippis makeLippis() {return new BossLippis();}

    @Override
    protected Farmari makeFarmari() {
        return new BossFarmari();
    }

    @Override
    protected T_Paita makeT_Paita() {
        return new BossT_Paita();
    }

    @Override
    protected Kengät makeKengät() {
        return new BossKengät();
    }
}
