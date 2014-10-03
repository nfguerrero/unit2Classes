import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Makes a building(a rectangle)
 * 
 * @author nfguerrero 
 * @version 10/3/14
 */
public class Road
{
    private int xLeft;
    private int yTop;
    private int xWidth;
    private int yHeight;
    
    /**
     * Default constructor for objects of class Road
     * @param left      the x-coordinate of the top-left corner
     * @param top       the y-coordinate of the top-left corner
     * @param width     the width of the road
     * @param height    the height of the road
     */
    public Road(int left, int top, int width, int height)
    {
        this.xLeft = left;
        this.yTop = top;
        this.xWidth = width;
        this.yHeight = height;
    }

    
    /**
     * Draws the Road
     * 
     * @param g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double road = new Rectangle2D.Double(this.xLeft, this.yTop, this.xWidth, this.yHeight);
        
        g2.draw(road);
    }
}
