import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author nfguerrero
 * @version 10/1/2014
 */
public class CityscapeComponent extends JComponent
{
    private int x = getWidth()/8;
    private int y = getHeith()/6;
    /**
     *Default constructor for objects of class CityscapeComponent
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Road road = new Road(x*7, y);
        Building buildLeft = new Building();
        Building buildRight = new Building();
        
        
        road.draw(g2);       
        
    }

}
