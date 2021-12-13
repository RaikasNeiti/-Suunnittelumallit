package Teht4;

public class DigitalClock implements Observer{

    private ClockTimer timer;
    public DigitalClock(ClockTimer ct){
        timer = ct;
        timer.attach(this);
    }
    @Override
    public void update(Subject s){
        if (s == timer){
        draw();
    }
}
    private void draw(){
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();

        System.out.println(String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second));
    }

}
