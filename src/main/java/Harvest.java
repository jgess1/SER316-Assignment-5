package main.java;

import java.util.Iterator;

/*  Harvest class uses two iterators, one to iterate through the list of farms, the other to iterate through
 * the product list of each farm.
 */

public class Harvest {
    
    public Harvest() {
    
        Iterator<Farm> farmIterator = Globals.farmList.iterator();
        
        while (farmIterator.hasNext()) {
            
            Farm farm = (Farm) farmIterator.next();
            
            Iterator<Product> productIterator = farm.productList.iterator();
            
            while (productIterator.hasNext()) {
                
                Product product = productIterator.next();
                
                if (product.canHarvest) {
                    Globals.gold += product.productSalesPrice;
                    System.out.println("Farm sold "+product.getSalesItem()+" for "+product.productSalesPrice+" gold coins.");
                    System.out.println("Gold increased to "+Globals.gold+" coins.\n");
                    product.Harvested();
                } else {
                    product.Age();
                }
            }
        }
    }     
}
