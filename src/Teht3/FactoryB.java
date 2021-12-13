package Teht3;

public class FactoryB extends AbstractFactory{
    @Override
    public CPU makeCpu() {return new CPU_B();}

    @Override
    public Emolevy makeEmolevy() {return new EmolevyB();}

    @Override
    public Grafiikkakortti makeGrafiikkakortti() {return new GrafiikkakorttiB();}

    @Override
    public Kotelo makeKotelo() {return new KoteloB();}

    @Override
    public Kovalevy makeKovalevy() {return new KovalevyB();}

    @Override
    public RAM makeRAM() {return new RAM_B();}

    @Override
    public Tuuletin makeTuuletin() {return new TuuletinB();}
}
