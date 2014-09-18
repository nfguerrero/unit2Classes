/**
* Write a description of class Door here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name ;
    private String state;
    
    /**
    * Default constructor for objects of class Door
    */
    public Door(String door_name, String door_state)
    {
        this.name = door_name;
        this.state = door_state;
    }
    
    /**
    * An example of a method - replace this comment with your own
    * that describes the operation of the method
    *
    * @pre preconditions for the method
    * (what the method assumes about the method's parameters and class's state)
    * @post postconditions for the method
    * (what the method guarantees upon completion)
    * @param y description of parameter y
    * @return description of the return value
    */
    public void CloseDoor()
    {
        if (this.state.compareTo("Opened")== 0)
        {
            this.state = "Closed" ;
        } 
    }
    public void OpenDoor()
    {
        if (this.state.compareTo("Closed") == 0)
        {
            this.state = "Opened" ;
        }
    }
    public String getName()
    {
        return this.name ;
    }
    public String getState()
    {
        return this.state ;
    }
    public void setName (String newName)
    {
        this.name = newName;
    }
    public void setState(String newState)
    {
        this.state = newState;
    }
}
