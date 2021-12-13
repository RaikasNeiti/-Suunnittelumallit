package Teht3;

public class FactoryA extends AbstractFactory{
    @Override
    public CPU makeCpu() {return new CPU_A();}

    @Override
    public Emolevy makeEmolevy() {
        return new EmolevyA();
    }

    @Override
    public Grafiikkakortti makeGrafiikkakortti() {
        return new GrafiikkakorttiA();
    }

    @Override
    public Kotelo makeKotelo() {
        return new KoteloA();
    }

    @Override
    public Kovalevy makeKovalevy() {return new KovalevyA();}

    @Override
    public RAM makeRAM() {
        return new RAM_A();
    }

    @Override
    public Tuuletin makeTuuletin() {
        return new TuuletinA();
    }
}
