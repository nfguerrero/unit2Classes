import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    private int xLeft;
    private int yTop;
    
    /**
     * Default constructor for objects of class Target
     * @param x      the x-coordinate of the top-left corner
     * @param y      the y-coordinate of the top-left corner
     */
    public Target(int x, int y)
    {
        this.xLeft = x;
        this.yTop = y;
    }

    /**
     * Draws the target.
     *            
     * @param    g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double outCircle = new Ellipse2D.Double(this.xLeft, this.yTop, 50, 50);
        g2.draw(outCircle);
    }

}
