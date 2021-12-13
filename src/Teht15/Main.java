package Teht15;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        InterfaceDate pvm = new Date();

        LocalDate date = pvm.getDate();

        System.out.println(date);
    }
}
