package main.java;

import java.util.Timer;
import java.util.TimerTask;

public class DayTimer {

    private Timer timer;
    private static boolean isDay = false;
    private static int dayCount = 0;
    
    
    // Mediator pattern
    public DayTimer(int seconds) {
        
        timer = new Timer();
        if (isDay) {
            timer.schedule(new Sunset(), seconds * 1000);
        } else {
            timer.schedule(new Sunrise(), seconds * 1000);
        }
    }
    
    //independent task
    class Sunrise extends TimerTask {
        public void run() {
            System.out.println("It's a new day!  Sun's up!");
            isDay = true;
            dayCount++;
            System.out.println("Day: "+dayCount);
            new DayTimer(3);
            new Harvest();
        }
    }
    
    //independent task
    class Sunset extends TimerTask {
        public void run() {
            System.out.println("The sun has set.  Night night.\n");
            isDay = false;
            new DayTimer(3);
        }
    }
    
}
