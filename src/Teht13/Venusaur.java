package Teht13;

public class Venusaur extends AbstrackPokemon {


    @Override
    void attack() {
        System.out.println("Venusaur used " + move());
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
        return "Venusaur";
    }

    @Override
    boolean checkEvolve(int xp) {
        return false;
    }

    @Override
    AbstrackPokemon evolve() {
        return null;
    }

    @Override
    int getXpToEvolve() {
        return 0;
    }


}
