package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import main.java.Animal;
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

public class ProductTest {
    
    Product gummiberries = new Gummiberry();
    Product jumjum = new Jumjum();
    Product fireflower = new Fireflower();
    Product smurfberries = new Smurfberry();
    Animal unicorn = new Unicorn();
    Animal owlbear = new Owlbear();
    Animal hippogriff = new Hippogriff();
    Product testGummiHarvest = new Gummiberry();
    List<Product> productList = new ArrayList<Product>();
    Farm.Builder builder1 = new Farm.Builder();
    Farm.Builder builder2 = new Farm.Builder();
    
    @Before
    public void setUp() {        
        builder1.name("Test").product(unicorn).productQty(4).farmerQty(5);  //specify components
        builder2.name("Test2").product(gummiberries);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void gummiNameTest() {
        assertTrue(gummiberries.getName().equals("gummiberry bush"));
    }
    
    @Test
    public void jumumSalesItemNameTest() {
        assertTrue(jumjum.getSalesItem().equals("jumjum roots"));
    }
    
    @Test
    public void fireflowerPurchasePriceTest() {
        assertEquals(40, fireflower.getPurchasePrice());
    }
    
    @Test
    public void smurfberryProductSalesPriceTest() {
        assertEquals(2, smurfberries.getProductSalesPrice());
    }
    
    @Test
    public void unicornAgeTest() {
        assertEquals(0, unicorn.getAge());
        assertEquals(2, unicorn.getCropReadyAge());
    }
    
    @Test
    public void oowlbearAdultAgeTest() {
        assertEquals(3, owlbear.getAdultAge());
    }
    
    @Test
    public void hippogriffDeathAgeTest() {
        assertEquals(14, hippogriff.getDeathAge());
    }
    
    @Test
    public void testHarvested() {
        testGummiHarvest.canHarvest = true;
        testGummiHarvest.harvestCounter = 3;
        testGummiHarvest.harvested();
        assertEquals(false, testGummiHarvest.canHarvest());
        assertEquals(0, testGummiHarvest.getHarvestCounter());
    }
    
    @Test
    public void testHasDied() {
        assertEquals(false, unicorn.hasDied());
    }
    
    @Test
    public void animalAge() {
        Farm farm1 = builder1.build(); //build instance
        unicorn.age(farm1); // age once
        assertEquals(1, unicorn.getAge());
        
        for (int i = 0; i < 2; i++) {  //age two more times
            unicorn.age(farm1);
        }
        
        assertEquals(3, unicorn.getAge());
        assertTrue(unicorn.canHarvest());
        
        for (int i = 0; i < 2; i++) {  //age two more times
            unicorn.age(farm1);
        }
        
        assertEquals(5, unicorn.getAge());
        
        for (int i = 0; i < 9; i++) {  //age 9 more times
            unicorn.age(farm1);
        }
        
        assertTrue(unicorn.hasDied());        
        
        unicorn.harvested();
        assertEquals(false, unicorn.canHarvest);
        assertEquals(0, unicorn.harvestCounter);
    }
    
    @Test
    public void productAge() {
        Farm farm2 = builder2.build(); //build instance
        gummiberries.age(farm2); // age once
        assertEquals(1, gummiberries.getHarvestCounter());
        for (int i = 0; i < 2; i++) {  //age two more times
            gummiberries.age(farm2);
        }
        assertTrue(gummiberries.canHarvest());
    }

}
