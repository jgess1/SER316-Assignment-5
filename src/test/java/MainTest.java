package test.java;

import static org.junit.Assert.assertEquals;

import main.java.Globals;
import main.java.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void initTest() {
        Main.init();
        assertEquals(100, Globals.getGold());
        assertEquals(600, Globals.getGoldGoal());
    }

}
