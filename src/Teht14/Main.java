package Teht14;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook();

        Builder builder = new HesburgerBuilder();

        cook.setBuilder(builder);
        cook.makeBurger();

        List<Ainekset> burger = (List<Ainekset>) builder.getBurger();
        System.out.println(builder.getBuildername());
        System.out.println(burger);

        Builder builder2 = new McDonaldsBuilder();

        cook.setBuilder(builder2);
        cook.makeBurger();

        StringBuilder burger2 = (StringBuilder) builder2.getBurger();
        System.out.println(builder2.getBuildername());
        System.out.println(burger2);
    }
}
