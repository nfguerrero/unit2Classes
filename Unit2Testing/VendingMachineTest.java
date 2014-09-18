

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGetCanCount()
    {
        VendingMachine testMachine = new VendingMachine(0);
        int cans = testMachine.getCanCount();
        assertEquals(0, cans, 1e-6);
    }
    
    @Test
    public void testGetTokenCount()
    {
        VendingMachine testMachine = new VendingMachine(0);
        int tokens = testMachine.getTokenCount();
        assertEquals(0, tokens, 1e-6);
    }

    @Test
    public void testFillUp()
    {
        VendingMachine testMachine = new VendingMachine(10);
        testMachine.fillUp(10);
        int cans = testMachine.getCanCount();
        assertEquals(20, cans, 1e-6);
        
        testMachine.fillUp(5);
        cans = testMachine.getCanCount();
        assertEquals(25, cans, 1e-6);
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine testMachine = new VendingMachine(10);
        testMachine.insertToken();
        int cans = testMachine.getCanCount();
        int tokens = testMachine.getTokenCount();
        assertEquals(9, cans, 1e-6);
        assertEquals(1, tokens, 1e-6);
    }
}
