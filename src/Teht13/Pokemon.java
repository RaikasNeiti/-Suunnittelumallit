package Teht13;

public class Pokemon {

    private AbstrackPokemon p;
    private String plast;
    private int currentEXP = 0;
    private boolean evolved = false;

    private Visitor visitor;

    public Pokemon(){
            p = new Bulbasaur();
            visitor = new Visitor();
        }

    public void attack() {
        p.attack();
    }

    public void GainExp(int exp){
        currentEXP += exp;
        visitor.visit(this);
    }


    public String getState(){
        return p.getState();
    }

    public int getCurrentXP(){
        return currentEXP;
    }

    public void setCurrentXP(int xp){
        currentEXP = xp;
    }

    public AbstrackPokemon getStat(){
        return p;
    }

    public void setState(AbstrackPokemon p){
        this.p = p;
    }

}
