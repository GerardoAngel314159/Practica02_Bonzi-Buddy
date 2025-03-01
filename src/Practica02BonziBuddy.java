import java.util.Timer;
import java.util.TimerTask;


public class Practica02BonziBuddy{
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            
            int days = 0;
            @Override
            public void run(){
                if (days < 5){
                    System.out.println("Haz rentado el libro por " + days + " días");
                    days++;
                }
                else {
                    System.out.println("Ya haz rentado el libro por " + days + " dias\nPor favor devuelvelo");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }
}