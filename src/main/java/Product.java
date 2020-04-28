package main.java;

/**
 * 
 * @author Jeremy Gess
 * 
 * The super class for the crops and animals that are kept on
 * the farms.  A few of the methods are overridden on the 
 * Animal class.  Most methods and attributes come from
 * this class.
 *
 */

public class Product {
    
    protected String name;
    protected String salesItem;
    protected int purchasePrice;
    protected int productSalesPrice;
    public boolean canHarvest = false;
    public int harvestCounter = 0;
    private int cropReadyAge = 3;
    protected boolean hasDied = false;
    
    public String getName() {
        return name;
    }
    
    public String getSalesItem() {
        return salesItem;
    }
    
    public int getPurchasePrice() {
        return purchasePrice;
    }
    
    public int getProductSalesPrice() {
        return productSalesPrice;
    }
    
    public boolean canHarvest() {
        return canHarvest;
    }
    
    public int getHarvestCounter() {
        return harvestCounter;
    }
    
    public void harvested() {        
        this.canHarvest = false;
        this.harvestCounter = 0;
    }
        
    public void age(Farm farm) {
        this.harvestCounter++;
        System.out.println(this.name + " grows at " + farm.getName());
        
        //Check if crops old enough to harvest now
        if (this.harvestCounter >= cropReadyAge) {
            this.canHarvest = true;
            System.out.println(this.name + " will be ready to harvest tomorrow.");
        }
    }
    
    public boolean hasDied() {
        return hasDied;
    }
}
