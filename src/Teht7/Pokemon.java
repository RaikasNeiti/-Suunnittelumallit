package Teht7;

public class Pokemon {

    private AbstrackPokemon p;
    private String plast;
    private int currentEXP = 0;
    private boolean evolved = false;

    public Pokemon(){
            p = new Bulbasaur();
        }

    public void attack() {
        p.attack();
    }

    public void GainExp(int exp){
        currentEXP += exp;
        checkEvolve();
    }

    public String getState(){
        return p.getState();
    }

    public void checkEvolve(){
        do {
            if (p.checkEvolve(currentEXP)) {
                currentEXP = currentEXP - p.getXpToEvolve();
                plast = p.getState();
                p = p.evolve();
                evolved = true;
                System.out.println("Your "+ plast+  " evolved into " + p.getState());
            }else{
                evolved = false;
            }
        }while (evolved);
    }

}
