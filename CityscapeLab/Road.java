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
        double sixth = this.xWidth/6.0;
        Rectangle2D.Double road = new Rectangle2D.Double(this.xLeft, this.yTop, this.xWidth, this.yHeight);
        Rectangle2D.Double line1 = new Rectangle2D.Double(this.xLeft+sixth*.05, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line2 = new Rectangle2D.Double(this.xLeft+sixth*.55, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line3 = new Rectangle2D.Double(this.xLeft+sixth*1.05, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line4 = new Rectangle2D.Double(this.xLeft+sixth*1.55, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line5 = new Rectangle2D.Double(this.xLeft+sixth*2.05, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line6 = new Rectangle2D.Double(this.xLeft+sixth*2.55, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line7 = new Rectangle2D.Double(this.xLeft+sixth*3.05, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line8 = new Rectangle2D.Double(this.xLeft+sixth*3.55, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line9 = new Rectangle2D.Double(this.xLeft+sixth*4.05, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line10 = new Rectangle2D.Double(this.xLeft+sixth*4.55, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line11 = new Rectangle2D.Double(this.xLeft+sixth*5.05, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        Rectangle2D.Double line12 = new Rectangle2D.Double(this.xLeft+sixth*5.55, this.yTop+this.yHeight*.4, sixth*.4, this.yHeight*.2);
        
        g2.draw(road);
        g2.setColor(Color.BLACK);
        g2.fill(road);
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        g2.draw(line4);
        g2.draw(line5);
        g2.draw(line6);
        g2.draw(line7);
        g2.draw(line8);
        g2.draw(line9);
        g2.draw(line10);
        g2.draw(line11);
        g2.draw(line12);
        g2.setColor(Color.YELLOW);
        g2.fill(line1);
        g2.fill(line2);
        g2.fill(line3);
        g2.fill(line4);
        g2.fill(line5);
        g2.fill(line6);
        g2.fill(line7);
        g2.fill(line8);
        g2.fill(line9);
        g2.fill(line10);
        g2.fill(line11);
        g2.fill(line12);
        
    }
}
