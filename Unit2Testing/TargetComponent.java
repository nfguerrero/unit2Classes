import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class TargetComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{

    /**
     * Default constructor for objects of class TargetComponent
     */
    public void paintComponent(Graphics g)
    {
       Graphics2D g2 = (Graphics2D) g;
       
       Target target1 = new Target(100, 100);
       Target target2 = new Target (300, 300);
       
       int x = getWidth() - 60;
       int y = getHeight() - 30;
       
       target1.draw(g2);
       target2.draw(g2);
    }

}
