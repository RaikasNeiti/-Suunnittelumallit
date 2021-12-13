package Teht14;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBurger {

    private List<Ainekset> burger;

    public HesburgerBurger(){
        burger = new ArrayList<>();
    }

    public void addAines(Ainekset aines){
        burger.add(aines);
    }

    public List getBurger(){
        return burger;
    }
}
