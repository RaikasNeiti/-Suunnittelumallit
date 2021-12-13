package Teht14;

public class Cook {

    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void makeBurger(){
        builder.createNewBurger();
        builder.buildJuusto();
        builder.buildPihvi();
        builder.buildSalaatti();
        builder.buildSämpylä();
    }
}
