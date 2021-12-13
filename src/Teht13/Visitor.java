package Teht13;

public class Visitor {

    private boolean evolved = false;

    public void visit(Pokemon pokemon){
        do {
            if (pokemon.getStat().checkEvolve(pokemon.getCurrentXP())){
                pokemon.setCurrentXP(pokemon.getCurrentXP() - pokemon.getStat().getXpToEvolve());
                pokemon.setState(pokemon.getStat().evolve());
                evolved = true;
                System.out.println("Your Pokemon evolved into " + pokemon.getStat().getState());
            }else{
                evolved = false;
            }
        }while (evolved);
    }
}
