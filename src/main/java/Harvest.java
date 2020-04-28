package main.java;

import java.util.Iterator;

/**
 * 
 * @author Jeremy Gess
 * 
 * Harvest class uses the Iterator design pattern and two Iterators; 
 * one to iterate through the list of farms, the other to iterate 
 * through the product list of each farm.
 * 
 * Used for accomplishing requirements 10, 14, 15, and 17.
 */

public class Harvest {
    
    public Harvest() {
    
        Iterator<Farm> farmIterator = Globals.getFarmList().iterator();
        
        while (farmIterator.hasNext()) {
            
            Farm farm = (Farm) farmIterator.next();
            
            Iterator<Product> productIterator = farm.productList.iterator();
            
            while (productIterator.hasNext()) {
                
                Product product = productIterator.next();
                
                if (product.canHarvest) {
                    Globals.addGold(product.productSalesPrice);
                    System.out.println(farm.getName() + " sold " + product.getSalesItem()
                        + " for " + product.productSalesPrice + " gold coins.");
                    System.out.println("Gold increased to " + Globals.getGold() + " coins.\n");
                    product.harvested();
                } else {
                    product.age(farm);                    
                    if (product.hasDied()) {  //remove the animal from the list if it died.
                        productIterator.remove();
                    }
                }                
            }
        }
    }     
}
