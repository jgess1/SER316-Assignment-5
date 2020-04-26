package main.java;

import java.util.Timer;
import java.util.TimerTask;

public class DayTimer {

    private Timer timer;
    private static boolean isDay = false;
    private static int dayCount = 0;
    
    
    // Mediator pattern
    public DayTimer(int seconds) {
        
        if(!checkGoal()) {
            timer = new Timer();
            if (isDay) {
                timer.schedule(new Sunset(), seconds * 1000);
            } else {
                timer.schedule(new Sunrise(), seconds * 1000);
            }
        } else {
            System.out.println("Hooray!  We've reached our goal by earning "+Globals.getGold()+" gold coins!");
        }
    }
    
    //independent task
    static class Sunrise extends TimerTask {
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
    static class Sunset extends TimerTask {
        public void run() {
            System.out.println("The sun has set.  Night night.\n");
            isDay = false;
            new DayTimer(3);
        }
    }
    
    //check if we are at our goal
    private boolean checkGoal() {
        return Globals.getGold() >= Globals.getGoldGoal();
    }
    
}
