package test.java;

import static org.junit.Assert.assertEquals;

import java.util.List;
import main.java.Animal;
import main.java.Farm;
import main.java.Globals;
import main.java.Unicorn;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GlobalsTest {
    
    Farm.Builder builder1 = new Farm.Builder();
    Animal unicorn = new Unicorn();
    
    @Before
    public void setUp() {        
        builder1.name("Test").product(unicorn).productQty(4).farmerQty(5);  //specify components
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void globalCurrentGoldTest() {
        assertEquals(100, Globals.getGold());
    }
    
    @Test
    public void globalSetGoldTest() {
        Globals.setGold(500);
        assertEquals(500, Globals.getGold());
        Globals.setGold(100);
        assertEquals(100, Globals.getGold());
    }
    
    @Test
    public void globalAddGoldTest() {
        Globals.addGold(100);
        assertEquals(200, Globals.getGold());
    }
    
    @Test
    public void globalGetGoalTest() {        
        assertEquals(600, Globals.getGoldGoal());
    }
    
    @Test
    public void globalSetGoalTest() {   
        Globals.setGoldGoal(700);
        assertEquals(700, Globals.getGoldGoal());
        Globals.setGoldGoal(600);
        assertEquals(600, Globals.getGoldGoal());        
    }
    
    @Test
    public void globalFarmListTest() {
        Farm farm1 = builder1.build(); //build instance
        List<Farm> farmList = Globals.getFarmList();
        farmList.add(farm1);
        assertEquals(3, farmList.size());
    }

}
