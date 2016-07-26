package simple;

import org.junit.Assert;
import org.junit.Test;

import es.ruben.test.simple.Calculation;

public class CalculationTest {
    
    @Test
    public void testCalculation() {
        Calculation cal = new Calculation();
        
        Assert.assertEquals(cal.sum(3, 2), 5);
    }

}
