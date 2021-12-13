package Teht13;

public abstract class AbstrackPokemon {



    abstract void attack();

    abstract String getState();

    abstract boolean checkEvolve(int xp);

    abstract AbstrackPokemon evolve();

    abstract int getXpToEvolve();

    abstract String move();


}
