package main.java;

public class Animal extends Product {
    
    public int age = 0;
    private int cropReadyAge = 2;
    private int adultAge = 3;
    private int deathAge = 14;   
    
    public void harvested() {
        
        this.age++; // advance the animals age.
        
        this.canHarvest = false;
        this.harvestCounter = 0;        
    }
    
    public void age(Farm farm) {
        
        this.age++; //advance the animals age.
        String farmName = farm.getName();
        
        if (this.age >= deathAge) {
            System.out.println("Old "+this.name+" dies of old age at"+farmName);
            hasDied = true;
            return;
        }
        
        if (this.age < adultAge) {
            System.out.println("Baby "+this.name+" grows at "+farmName);
            return;
        } else {
            if (this.age == adultAge) {
                this.canHarvest = true;
                System.out.println(this.name+" has reached adulthood at "+farmName);
                return;
            }
        }
        
        this.harvestCounter++;
        System.out.println(this.name+" ages at "+farmName);
        
        //Check if animal is ready to harvest now
        if(this.harvestCounter >= cropReadyAge) {
            this.canHarvest = true;
            System.out.println(this.name+" will be ready to harvest tomorrow.");
        }
    }
}
