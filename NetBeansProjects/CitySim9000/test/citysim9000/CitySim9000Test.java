
package citysim9000;

import junit.framework.TestCase;

/**
 *
 * @author justinruoff
 */
public class CitySim9000Test extends TestCase {
    
    public CitySim9000Test(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of isInteger method, of class CitySim9000.
     */
    public void testIsInteger() {
        System.out.println("isInteger");
        String s = "1";
        boolean expResult = true;
        boolean result = CitySim9000.isInteger(s);
        assertEquals(expResult, result);
      
    }
}
