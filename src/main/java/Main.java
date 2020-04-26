package main.java;

import java.util.List;

public class Main {    
    
    public static void init() {             
        System.out.println("Starting amount of gold coins: "+Globals.getGold()+"\n");
        System.out.println("Building first farm.");
        
        Farm.Builder builder = new Farm.Builder(); //create farm with Builder
        builder.name("Bilbo's Farm").product(new Unicorn());  //specifies name and product
        System.out.println("First farm built:");
        Farm farm1 = builder.build(); //build instance
        farm1.productList.add(new Gummiberry());  // add a second product to the first farm's product list.
        List<Farm> farmList = Globals.getFarmList();
        farmList.add(farm1);
        
        Farm.Builder builder2 = new Farm.Builder(); // create another builder
        builder2.name("Joey's Farm"); //specifies only name
        System.out.println("\nSecond farm built:");
        Farm farm2 = builder2.build(); //build instance
        farmList.add(farm2);
        
        new DayTimer(3); //start day-night cycle with Mediator
        
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Fantasy Farms!\n");
        System.out.println("Our goal is to make "+Globals.getGoldGoal()+" gold coins!\n");
        
        init();       
        
    }

}
