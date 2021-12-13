package Teht12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Image> Folder = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Folder.add(new ProxyImage("Picture " + (i+1)));
        }

        for(Image a : Folder){
            System.out.println(a.showData());
        }

        for(Image a : Folder){
            a.displayImage();
        }
    }
}
