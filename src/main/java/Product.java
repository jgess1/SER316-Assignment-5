package main.java;

public class Product {
    
    protected String name;
    protected String salesItem;
    protected int purchasePrice;
    protected int productSalesPrice;
    public boolean canHarvest = false;
    public int harvestCounter = 0;
    private int cropReadyAge = 3;
    
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
    
    public void Harvested() {        
        this.canHarvest = false;
        this.harvestCounter = 0;
    }
    
    public void Age() {
        this.harvestCounter++;
        System.out.println(this.name+" grows.");
        
        //Check if crops old enough to harvest now
        if(this.harvestCounter >= cropReadyAge) {
            this.canHarvest = true;
            System.out.println(this.name+" will be ready to harvest tomorrow.");
        }
    }
}
