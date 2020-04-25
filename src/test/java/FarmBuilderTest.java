package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Farm;
import main.java.Jumjum;
import main.java.Product;
import main.java.Unicorn;

public class FarmBuilderTest {
    
    Farm.Builder builder1 = new Farm.Builder(); 
    Farm.Builder builder2 = new Farm.Builder();
    Farm.Builder builder3 = new Farm.Builder();
    
    @Before
    public void setUp() {
        Product builder1Product = new Unicorn();
        builder1.product(builder1Product).productQty(4).farmerQty(5);  //specify components
        
        Product builder2Product = new Jumjum();
        builder2.product(builder2Product);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    //all three parameters specified
    public void farm1() {
        Farm farm1 = builder1.build(); //build instance  
        assertEquals("unicorn", farm1.getProductName());
        assertEquals(4, farm1.getProductQty());
        assertEquals(5, farm1.getFarmerQty());
    }
    
    @Test
    //only 1 parameter specified
    public void farm2() {
        Farm farm2 = builder2.build(); //build instance  
        assertTrue(farm2.getProductName() == "gummiberry bush" || farm2.getProductName() == "jumjum plants" || farm2.getProductName() == "fireflower bush" || farm2.getProductName() == "smurfberry bush");
        assertEquals(2, farm2.getProductQty());
        assertEquals(1, farm2.getFarmerQty());
    }
    
    @Test
    //no parameters specified
    public void farm3() {
        Farm farm3 = builder3.build(); //build instance
        assertTrue(farm3.getProductName() == "gummiberry bush" || farm3.getProductName() == "jumjum plants" || farm3.getProductName() == "fireflower bush" || farm3.getProductName() == "smurfberry bush" || farm3.getProductName() == "unicorn" || farm3.getProductName() == "owlbear" || farm3.getProductName() == "hippogriff");
        assertEquals(2, farm3.getProductQty());
        assertEquals(1, farm3.getFarmerQty());
    }
}
