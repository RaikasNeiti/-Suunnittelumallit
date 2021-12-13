package Teht9;

import java.util.Iterator;
import java.util.List;

public class IteratorConverter implements ListConverter{


    @Override
    public String listToString(List list) {
        Iterator<String> itr = list.iterator();
        StringBuilder string = new StringBuilder();
        while(itr.hasNext()){
            string.append(itr.next() + "\n");
        }
        return string.toString();
    }
}
