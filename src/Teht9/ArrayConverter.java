package Teht9;

import java.util.List;

public class ArrayConverter implements ListConverter {



    @Override
    public String listToString(List list) {
        String[] array  = (String[]) list.toArray(new String[0]);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            if((i+1)%2 == 0){
                stringBuilder.append(array[i] + "\n");
            }else{
                stringBuilder.append(array[i] + " ");
            }

        }
        return stringBuilder.toString();
    }
}
