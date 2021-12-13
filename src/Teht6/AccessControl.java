package Teht6;

import java.util.Scanner;

public class AccessControl extends Decorator{

    public AccessControl(Window decoratedData) {
        super(decoratedData);
    }

    public Kone getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna salasana: ");
        String salasana = sc.nextLine();

        if(salasana.equals("joku")){
            return super.getInfo();
        }else{
            return null;
        }
    }
}
