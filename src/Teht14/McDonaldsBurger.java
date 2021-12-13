package Teht14;

public class McDonaldsBurger{

    private StringBuilder burger;

    public McDonaldsBurger(){
        burger = new StringBuilder();
    }

    public void addAines(String aines){
        burger.append(aines + " ");
    }

    public StringBuilder getBurger(){
        return burger;
    }
}
