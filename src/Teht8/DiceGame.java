package Teht8;

import java.util.Random;

public class DiceGame extends Game{

    private boolean end = false;
    private int winner;
    private int target;
    private final int maxDiceRoll = 12;
    Random rand;


    @Override
    void initializeGame() {
        rand = new Random();
        target = rollDice();
        System.out.println("Target is: " + target);
    }

    @Override
    void makePlay(int player) {

        int roll = rollDice();
        System.out.println("Player " + player + " rolled " + roll);
        if(target == roll){
            end = true;
            winner = player;
        }
    }

    @Override
    boolean endOfGame() {
        return end;
    }

    @Override
    void printWinner() {
        System.out.println("The winner is player " + winner);
    }

    public int rollDice(){
        return (rand.nextInt(maxDiceRoll) + 1);
    }
}
