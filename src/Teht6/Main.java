package Teht6;

public class Main {

    public static void main(String[] args){

        Window info = new AccessControl(new Kone());

        Kone kone = info.getInfo();

        System.out.println(kone);
    }
}
