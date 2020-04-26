package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/* Builder design pattern
 * Satisfies requirements 1, 2, 7, and 9
 */

public class Farm {
    
    public static class Builder {
        private String name = "Farm";
        private Product product;
        private int productQty = 2;  // default 
        private int farmerQty = 1;  // default        
        
        public Builder() {
            
        }
        
        public Farm build() {
            return new Farm(this);
        }
        
        public Builder name(String name) {
            this.name = name;
            return this;  // return builder object
        }
        
        public Builder product(Product product) {
            this.product = product;
            return this; // return builder object
        }
        
        public Builder productQty(int productQty) {
            this.productQty = productQty;
            return this; // return builder object
        }
        
        public Builder farmerQty(int farmerQty) {
            this.farmerQty = farmerQty;
            return this; // return builder object
        }
    }
        
    private String name;
    private Product product;
    private int productQty;
    private int farmerQty;
    private int randMin = 1;
    private int randMax = 7;
    public List<Product> productList = new ArrayList<Product>();
    
    private Farm(Builder builder) {
        
        this.name = builder.name;
        
        // if product not supplied by call randomize product 
        if (builder.product == null) {            

            int rnum = ThreadLocalRandom.current().nextInt(randMin, randMax + 1);
            switch (rnum) {
            case 1:
                this.product = new Gummiberry();                
                break;
            case 2:
                this.product = new Jumjum();                
                break;
            case 3:
                this.product = new Fireflower();                
                break;
            case 4:
                this.product = new Smurfberry();                
                break;
            case 5:
                this.product = new Unicorn();                
                break;
            case 6:
                this.product = new Owlbear();                
                break;
            case 7:
                this.product = new Hippogriff();                
                break;
            default:
                break;
            }
            
        } else {
            this.product = builder.product;
        }
        productList.add(this.product);
        
        this.productQty = builder.productQty;
        this.farmerQty = builder.farmerQty;
        
        System.out.println("Name: "+name);
        System.out.println("Product type: "+getProductName());
        System.out.println("Product Qty: "+productQty);
        System.out.println("Number of Farmers: "+farmerQty+"\n");
    }
    
    public String getName() {
        return name;
    }
    
    public String getProductName() {
        return product.getName();
    }
    
    public int getProductQty() {
        return productQty;
    }
    
    public int getFarmerQty() {
        return farmerQty;
    }
    
} 
    


