package Teht7;

public class Bulbasaur extends AbstrackPokemon {


    private final int xpToEvolve = 100;


    @Override
    void attack() {
        System.out.println("Bulbasaur used "+ move());
    }

    @Override
    String move(){
        double a = Math.random()*(4-1+1)+1;
        String move;
        switch((int) a) {
            case 1:
                move = "Tackle";
                break;
            case 2:
                move = "Vine Whip";
                break;
            case 3:
                move = "Razor Leaf";
                break;
            case 4:
                move = "Seed Bomb";
                break;
            default:
                move = "null";
                break;
        }
        return move;
    }

    @Override
    String getState() {
        return "Bulbasaur";
    }


    @Override
    boolean checkEvolve(int xp) {
        if(xp > xpToEvolve){
            return true;
        }
        return false;
    }

    @Override
    AbstrackPokemon evolve() {
        return new Ivysaur();
    }

    @Override
    int getXpToEvolve() {
        return xpToEvolve;
    }


}
