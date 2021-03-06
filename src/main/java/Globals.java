package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jeremy Gess
 * 
 * Globals class to hold the current gold generated by the farms, 
 * the target goal of gold to collect to end the simulation, 
 * and the Farms list to hold the Farms objects.
 *
 */

public class Globals {
    private static int gold = 100;
    private static List<Farm> farmList = new ArrayList<Farm>();
    private static int goldGoal = 600;    
    
    public static int getGold() {
        return gold;
    }
    
    public static void setGold(int newGold) {
        gold = newGold;
    }
    
    public static void addGold(int newGold) {
        gold += newGold;
    }
    
    public static int getGoldGoal() {
        return goldGoal;
    }
    
    public static void setGoldGoal(int newGoal) {
        goldGoal = newGoal;
    }
    
    public static List<Farm> getFarmList() {
        return farmList;
    }
}


