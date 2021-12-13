package Teht4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            ClockTimer timer = ClockTimer.getClockTimer();
            Thread t = new Thread(timer);
            DigitalClock digitalClock = new DigitalClock(timer);

            t.start();
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            if(string.equals("s")){
                timer.stop();
            }
            System.out.println("stop");


    }

}
