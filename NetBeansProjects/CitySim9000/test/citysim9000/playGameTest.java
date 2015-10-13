package citysim9000;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;


/**
 *
 * @author justinruoff
 */
public class playGameTest extends TestCase {
    
    public playGameTest(String testName) {
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
     * Test of getRandom method, of class playGame.
     */
    public void testGetRandom() {
        System.out.println("getRandom");
        int anumber = 0;
        playGame instance = null;
        int expResult = 0;
        playGame game = new playGame(anumber);
        int result = game.getRandom(anumber);
        if (result == 1 || result == 2){
             assertEquals(true, true);
        }else{
             assertEquals(false, true);
        }
       
       
    }

    /**
     * Test of atMall method, of class playGame.
     */
    public void testAtMall() {
        System.out.println("atMall");
        int number = 0;
        playGame instance = null;
        boolean expResult = true;
        playGame game = new playGame(number);
        boolean result = game.atMall(number);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of atCoffee method, of class playGame.
     */
    public void testAtCoffee() {
        System.out.println("atCoffee");
        int number = 0;
        playGame instance = null;
        Boolean expResult = true;
        playGame game = new playGame(number);
        Boolean result = game.atCoffee(number);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of atBookstore method, of class playGame.
     */
    public void testAtBookstore() {
        System.out.println("atBookstore");
        int number = 0;
        playGame instance = null;
        Boolean expResult = true;
        playGame game = new playGame(number);
        Boolean result = game.atBookstore(number);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of atUniversity method, of class playGame.
     */
    public void testAtUniversity() {
        System.out.println("atUniversity");
        int number = 0;
        playGame instance = null;
        Boolean expResult = true;
        playGame game = new playGame(number);
        Boolean result = game.atUniversity(number);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of outsideCity method, of class playGame.
     */
    public void testOutsideCity() {
        System.out.println("outsideCity");
        int number = 0;
        playGame instance = null;
        Boolean expResult = true;
        playGame game = new playGame(number);
        Boolean result = game.outsideCity(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
}
