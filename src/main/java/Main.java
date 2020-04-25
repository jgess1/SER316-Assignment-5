package main.java;


public class Main {    
    
    public static void init() {
        //Build first farm        
        System.out.println("Starting amount of gold coins: "+Globals.gold+"\n");
        System.out.println("Building first farm.");
        Farm.Builder builder = new Farm.Builder(); //create builder        
        System.out.println("First farm built:");
        Farm farm1 = builder.build(); //build instance
        Globals.farmList.add(farm1);
        Farm farm2 = builder.build(); //build instance
        Globals.farmList.add(farm2);
        new DayTimer(3);
        
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Fantasy Farms!\n");
        
        init();       
        
    }

}
