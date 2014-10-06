import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Makes the sky
 * 
 * @author nfguerrero 
 * @version 10/5/14
 */
public class Sky
{
    private int xWidth;
    private int yHeight;
    /**
     * Constructor for objects of class Sky
     * @param width     the width for the end of the sky to go to
     * @param height     the height for the end of the sky to go to
     */
    public Sky(int width, int height)
    {
        this.xWidth = width;
        this.yHeight = height;
    }

    /**
     * Draws the sky 
     * 
     * @param g2    the graphics context.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, this.xWidth, this.yHeight);
        
        Color skyColor = new Color(25, 183, 250);
        g2.setColor(skyColor);
        g2.draw(sky);
        g2.fill(sky);
    }
}
