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
public class TargetComponent extends JComponent
{

    /**
     * Default constructor for objects of class TargetComponent
     */
    public void paintComponent(Graphics g)
    {
       Graphics2D g2 = (Graphics2D) g;
       
       Random genx = new Random();
       int xcoor = genx.nextInt(300);
       xcoor += 100;
       Random geny = new Random();
       int ycoor = geny.nextInt(300);
       ycoor += 100;
       
       Target target1 = new Target(xcoor, ycoor);
       
       int x = getWidth() - 60;
       int y = getHeight() - 30;
       
       target1.draw(g2);
    }

}
