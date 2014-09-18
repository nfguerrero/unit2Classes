

/**
 * Write a description of class VendingMachine here.
 * 
 * @author nfguerrero 
 * @version 9/18/14
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans;
    private int tokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        this.cans = 10;
        this.tokens = 0;
    }
    
    public VendingMachine(int startCans)
    {
        this.cans = startCans;
        this.tokens = 0;
    }

    /**
 
     */
    public void fillUp(int newCans)
    {
        this.cans += newCans;
    }
    
    public int getCanCount()
    {
        return this.cans;
    }
    
    public int getTokenCount()
    {
        return this.tokens;
    }
    
    public void insertToken()
    {
        this.tokens += 1;
        this.cans -= 1;
    }
}
