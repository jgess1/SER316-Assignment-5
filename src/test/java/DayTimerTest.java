package test.java;

import static org.junit.Assert.assertEquals;

import main.java.DayTimer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DayTimerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        DayTimer day = new DayTimer(3);
        day.setIsDay(true);
        DayTimer night = new DayTimer(3);        
    }

}
