package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import main.java.Farm;
import main.java.Fireflower;
import main.java.Gummiberry;
import main.java.Hippogriff;
import main.java.Jumjum;
import main.java.Owlbear;
import main.java.Product;
import main.java.Smurfberry;
import main.java.Unicorn;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FarmBuilderTest {
    
    Farm.Builder builder1 = new Farm.Builder(); 
    Farm.Builder builder2 = new Farm.Builder();
    Farm.Builder builder3 = new Farm.Builder();
    Farm.Builder owlbearBuilder = new Farm.Builder();
    Farm.Builder hippogriffBuilder = new Farm.Builder();
    Farm.Builder gummiberryBuilder = new Farm.Builder();
    Farm.Builder jumjumBuilder = new Farm.Builder();
    Farm.Builder fireflowerBuilder = new Farm.Builder();
    Farm.Builder smurfberryBuilder = new Farm.Builder();
    
    @Before
    public void setUp() {
        
        builder1.product(new Unicorn()).productQty(4).farmerQty(5);  //specify components        
        builder2.product(new Jumjum());        
        owlbearBuilder.product(new Owlbear());        
        hippogriffBuilder.product(new Hippogriff());
        gummiberryBuilder.product(new Gummiberry());
        jumjumBuilder.product(new Jumjum());
        fireflowerBuilder.product(new Fireflower());
        smurfberryBuilder.product(new Smurfberry());
        
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
        assertTrue(farm2.getProductName() == "gummiberry bush" 
            || farm2.getProductName() == "jumjum plants" 
            || farm2.getProductName() == "fireflower bush" 
            || farm2.getProductName() == "smurfberry bush");
        assertEquals(2, farm2.getProductQty());
        assertEquals(1, farm2.getFarmerQty());
    }
    
    @Test
    //no parameters specified
    public void farm3() {
        Farm farm3 = builder3.build(); //build instance
        assertTrue(farm3.getProductName() == "gummiberry bush" 
            || farm3.getProductName() == "jumjum plants" 
            || farm3.getProductName() == "fireflower bush" 
            || farm3.getProductName() == "smurfberry bush" 
            || farm3.getProductName() == "unicorn" 
            || farm3.getProductName() == "owlbear" 
            || farm3.getProductName() == "hippogriff");
        assertEquals(2, farm3.getProductQty());
        assertEquals(1, farm3.getFarmerQty());
    }
    
    @Test    
    public void owlbearFarm() {
        Farm owlbearFarm = owlbearBuilder.build(); //build instance  
        assertEquals("owlbear", owlbearFarm.getProductName());
    }
    
    @Test    
    public void hippogriffFarm() {
        Farm hippogriffFarm = hippogriffBuilder.build(); //build instance  
        assertEquals("hippogriff", hippogriffFarm.getProductName());
    }
    
    @Test    
    public void gummiberryFarm() {
        Farm gummiberryFarm = gummiberryBuilder.build(); //build instance  
        assertEquals("gummiberry bush", gummiberryFarm.getProductName());
    }
    
    @Test    
    public void jumjumFarm() {
        Farm jumjumFarm = jumjumBuilder.build(); //build instance  
        assertEquals("jumjum plants", jumjumFarm.getProductName());
    }
    
    @Test    
    public void fireflowerFarm() {
        Farm fireflowerFarm = fireflowerBuilder.build(); //build instance  
        assertEquals("fireflower bush", fireflowerFarm.getProductName());
    }
    
    @Test    
    public void smurfberryFarm() {
        Farm smurfberryFarm = smurfberryBuilder.build(); //build instance  
        assertEquals("smurfberry bush", smurfberryFarm.getProductName());
    }
}
