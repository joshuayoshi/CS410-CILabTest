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
    
    @Test
    public void detectCapitalUseTest2() {
    	CILab s = new CILab();
    	s.setString("ducKLing");
    	boolean expected = false;
    	boolean actual = s.detectCapitalUse();
        assertEquals(expected, actual);
    }

    @Test
    public void detectCapitalUseTest3() {
    	CILab s = new CILab();
    	s.setString("duckling");
    	boolean expected = true;
    	boolean actual = s.detectCapitalUse();
        assertEquals(expected, actual);
    }
    
    @Test
    public void detectCapitalUseTest4() {
    	CILab s = new CILab();
    	s.setString("GIT");
    	boolean expected = true;
    	boolean actual = s.detectCapitalUse();
        assertEquals(expected, actual);
    }
    
    @Test
    public void detectCapitalUseTest5() {
    	CILab s = new CILab();
    	s.setString("cAPITAL");
    	boolean expected = false;
    	boolean actual = s.detectCapitalUse();
        assertEquals(expected, actual);
    }
    
    @Test
    public void detectCapitalUseTest6() {
    	CILab s = new CILab();
    	s.setString("a");
    	boolean expected = true;
    	boolean actual = s.detectCapitalUse();
        assertEquals(expected, actual);
    }
    
    @Test
    public void detectCapitalUseTest7() {
    	CILab s = new CILab();
    	s.setString("b");
    	boolean expected = true;
    	boolean actual = s.detectCapitalUse();
        assertEquals(expected, actual);
    }
}
