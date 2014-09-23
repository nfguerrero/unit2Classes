import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Write a description of class TargetComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SizeTargetComponent extends JComponent
{

    /**
     * Default constructor for objects of class SizeTargetComponent
     */
    public void paintComponent(Graphics g)
    {
       Graphics2D g2 = (Graphics2D) g;
       
       int x = getWidth() / 2;
       int y = getHeight() / 2;
       
       SizeTarget target1 = new SizeTarget(x, y);
       
       target1.draw(g2);
    }

}
