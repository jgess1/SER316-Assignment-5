package main.java;

public class Animal extends Product {
    
    public int age = 0;
    private int cropReadyAge = 2;
    private int adultAge = 3;
    private int deathAge = 14;
    
    public void Age() {
        
        this.age++; //advance the animals age.
        
        if (this.age >= deathAge) {
            System.out.println("Old "+this.name+" dies of old age.");
            return;
        }
        
        if (this.age < adultAge ) {
            System.out.println("Baby "+this.name+" grows");
            return;
        }
        
        this.harvestCounter++;
        System.out.println(this.name+" ages.");
        
        //Check if animal is ready to harvest now
        if(this.harvestCounter >= cropReadyAge) {
            this.canHarvest = true;
            System.out.println(this.name+" will be ready to harvest tomorrow.");
        }
    }

}
