package Teht4;

public class ClockTimer extends Subject implements Runnable{

    private static ClockTimer instance = null;
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    private boolean status = true;

    private ClockTimer(){}

    public static ClockTimer getClockTimer(){
        if (instance == null){
            instance = new ClockTimer();
        }
        return instance;
    }

    public void tick() {
        if(++second == 60){
            second = 0;
            if(++minute == 60){
                minute = 0;
                hour++;
            }
        }
        notifyObserver();
    }


    public int getHour() {return hour;}

    public int getMinute() {return minute;}

    public int getSecond() {return second;}


    @Override
    public void run() {
        time();

    }

    public void time(){
        while(status){
            tick();
            try {
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void stop(){
        status = false;
    }
}

