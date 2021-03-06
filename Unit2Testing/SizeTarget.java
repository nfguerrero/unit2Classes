import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SizeTarget
{
    private int xLeft;
    private int yTop;
    
    /**
     * Default constructor for objects of class Target
     * @param x      the x-coordinate of the top-left corner
     * @param y      the y-coordinate of the top-left corner
     */
    public SizeTarget(int x, int y)
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
        Ellipse2D.Double outCircle = new Ellipse2D.Double(0, 0, this.xLeft, this.yTop);
        Ellipse2D.Double midCircle = new Ellipse2D.Double(50, 50, this.xLeft - 100, this.yTop - 100);
        Ellipse2D.Double inCircle = new Ellipse2D.Double(100, 100, this.xLeft - 200, this.yTop - 200);
        
        g2.setColor(Color.RED);
        g2.draw(outCircle);
        g2.fill(outCircle);
        g2.setColor(Color.WHITE);
        g2.draw(midCircle);
        g2.fill(midCircle);
        g2.setColor(Color.RED);
        g2.draw(inCircle);
        g2.fill(inCircle);
    }

}
