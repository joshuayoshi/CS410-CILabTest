import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CILabTest {

    private CILabInterface myString;

    @BeforeMethod
    public void setUp() {
        myString = new CILab();
    }

    @AfterMethod
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
    	CILab s = new CILab();
    	s.setString("Asdf");
    	boolean expected = true;
    	boolean actual = s.detectCapitalUse();
        assertEquals(expected, actual);
    }
    
//    @Test
//    public void detectCapitalUseTest2() {
//        fail("Not yet implemented");
//    }


}
