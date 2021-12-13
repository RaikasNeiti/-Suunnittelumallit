package Teht14;

public class McDonaldsBuilder extends Builder{

    private McDonaldsBurger burger;
    @Override
    public void createNewBurger() {
        burger = new McDonaldsBurger();
    }

    @Override
    public void buildPihvi() {
        burger.addAines("Pihvi");
    }

    @Override
    public void buildJuusto() {
        burger.addAines("Juusto");
    }

    @Override
    public void buildSalaatti() {
        burger.addAines("Salaatti");
    }

    @Override
    public void buildSämpylä() {
        burger.addAines("Sämpylä");
    }
    @Override
    public String getBuildername(){return "McDonals";}

    @Override
    public Object getBurger() {
        return burger.getBurger();
    }
}
