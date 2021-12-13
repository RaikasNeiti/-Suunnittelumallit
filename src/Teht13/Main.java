package Teht13;

public class Main {

    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon();

        System.out.println("Your Pokemon is " + pokemon.getState());
        pokemon.attack();
        pokemon.GainExp(125);
        pokemon.attack();
        pokemon.GainExp(475);
        pokemon.attack();

    }
}
