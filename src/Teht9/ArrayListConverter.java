package Teht9;

import java.util.List;

public class ArrayListConverter implements ListConverter{


    @Override
    public String listToString(List list) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            if((i+1)%3 == 0){
                stringBuilder.append(list.get(i) + "\n");
            }else{
                stringBuilder.append(list.get(i) + " ");
            }

        }
        return stringBuilder.toString();
    }
}
