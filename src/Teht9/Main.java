package Teht9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        ListConverter strategy;

        for(int i = 0; i < 10; i++){
            list.add(Integer.toString(i + 1));
        }

        strategy = new IteratorConverter();

        String string = strategy.listToString(list);
        System.out.println(string);
        strategy = new ArrayConverter();
        String string2 = strategy.listToString(list);
        System.out.println(string2);

        strategy = new ArrayListConverter();
        String string3 = strategy.listToString(list);
        System.out.println(string3);

    }
}
