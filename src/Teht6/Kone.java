package Teht6;

public class Kone implements Window {


    private String tuote = "Kone";
    private int hinta = 3000;

    @Override
    public Kone getInfo() {
        return this;
    }

    public String toString(){
        return "Tuote on " + tuote + " ja sen hinta on " + hinta + " euroa.";
    }


}
