package junitcalculatorv3;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

//    private Integer mmValue = 1000;
//    private Integer cmValue = 100;
//    private Integer dmValue = 10;
//    private Integer mValue = 1;
//    private Integer kmValue = 1;

    JUnitCalculator calcTest = new JUnitCalculator(1000, 100, 10, 1, 1);

    @Test
    void getMmValueTest(){

        int result = calcTest.getMmValue(1000);
        Assert.assertEquals(1000, result);

    }

    @Test

    void testAdditionMM(){
        calcTest.additionMM(1000, 100, 10, 1, 1);
        Assert.assertEquals(100400, calcTest.additionMM(1000, 100, 10, 1, 1));
    }


}
