package Teht14;

public class HesburgerBuilder extends Builder{

    private HesburgerBurger burger;
    @Override
    public void createNewBurger() {
        burger = new HesburgerBurger();
    }

    @Override
    public void buildPihvi() {
        burger.addAines(new Pihvi());
    }

    @Override
    public void buildJuusto() {
        burger.addAines(new Juusto());
    }

    @Override
    public void buildSalaatti() {
        burger.addAines(new Salaatti());
    }

    @Override
    public void buildSämpylä() {
        burger.addAines(new Sämpylä());
    }

    @Override
    public String getBuildername(){return "Hesburger";}

    @Override
    public Object getBurger() {
        return burger.getBurger();
    }
}
