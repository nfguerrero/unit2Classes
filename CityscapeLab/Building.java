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
public class Building
{
    private int xLeft;
    private int yTop;
    private int xWidth;
    private int yHeight;
    
    /**
     * Default constructor for objects of class Building
     * @param left      the x-coordinate of the top-left corner
     * @param top       the y-coordinate of the top-left corner
     * @param width     the width of the building
     * @param height    the height of the building
     */
    public Building(int left, int top, int width, int height)
    {
        this.xLeft = left;
        this.yTop = top;
        this.xWidth = width;
        this.yHeight = height;
    }

    
    /**
     * Draws the building
     * 
     * @param g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        double third = this.yHeight/3.0;
        double gap = CityscapeComponent.gap;
        
        Rectangle2D.Double outline = new Rectangle2D.Double(this.xLeft, this.yTop, this.xWidth, this.yHeight);
        Rectangle2D.Double building = new Rectangle2D.Double(this.xLeft+gap*.05, this.yTop+third*.05, this.xWidth-this.xWidth*.1, this.yHeight-third*.1);
        Rectangle2D.Double window1 = new Rectangle2D.Double(this.xLeft+gap*.07, this.yTop+third*.1, gap*.4, third*.4);
        Rectangle2D.Double window2 = new Rectangle2D.Double(this.xLeft+gap*.53, this.yTop+third*.1, gap*.4, third*.4);
        Rectangle2D.Double window3 = new Rectangle2D.Double(this.xLeft+gap*.07, this.yTop+third*.6, gap*.4, third*.4);
        Rectangle2D.Double window4 = new Rectangle2D.Double(this.xLeft+gap*.53, this.yTop+third*.6, gap*.4, third*.4);
        Rectangle2D.Double window5 = new Rectangle2D.Double(this.xLeft+gap*.07, this.yTop+third*1.1, gap*.4, third*.4);
        Rectangle2D.Double window6 = new Rectangle2D.Double(this.xLeft+gap*.53, this.yTop+third*1.1, gap*.4, third*.4);
        Rectangle2D.Double window7 = new Rectangle2D.Double(this.xLeft+gap*.07, this.yTop+third*1.6, gap*.4, third*.4);
        Rectangle2D.Double window8 = new Rectangle2D.Double(this.xLeft+gap*.53, this.yTop+third*1.6, gap*.4, third*.4);
        Rectangle2D.Double window9 = new Rectangle2D.Double(this.xLeft+gap*.07, this.yTop+third*2.1, gap*.4, third*.4);
        Rectangle2D.Double window10 = new Rectangle2D.Double(this.xLeft+gap*.53, this.yTop+third*2.1, gap*.4, third*.4);
        Rectangle2D.Double door = new Rectangle2D.Double(this.xLeft+gap*.37, this.yTop+third*2.6, gap*.26, third*.4);
        
        g2.setColor(Color.GRAY);
        g2.draw(outline);
        g2.fill(outline);
        g2.setColor(Color.BLACK);
        g2.draw(outline);
        g2.setColor(Color.LIGHT_GRAY);
        g2.draw(building);
        g2.fill(building);
        g2.setColor(Color.CYAN);
        g2.draw(window1);
        g2.fill(window1);
        g2.draw(window2);
        g2.fill(window2);
        g2.draw(window3);
        g2.fill(window3);
        g2.draw(window4);
        g2.fill(window4);
        g2.draw(window5);
        g2.fill(window5);
        g2.draw(window6);
        g2.fill(window6);
        g2.draw(window7);
        g2.fill(window7);
        g2.draw(window8);
        g2.fill(window8);
        g2.draw(window9);
        g2.fill(window9);
        g2.draw(window10);
        g2.fill(window10);
        Color doorColor = new Color(191,111,51);
        g2.setColor(doorColor);
        g2.draw(door);
        g2.fill(door);
    }
}
