import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Person here.
 * 
 * @author nfguerrero 
 * @version 10/6/14
 */
public class Person
{
    private int xCoor;
    private int yCoor;
    private int personStatus;
    /**
     * Default constructor for objects of class Person
     * 
     * @param x             the x-coordinate of the middle of the body
     * @param y             the y-coordinate of the middle of the body
     * @param status        0 = zombie, 1 = wimp, 2 = marine
     */
    public Person(int x, int y, int status)
    {
        this.xCoor = x;
        this.yCoor = y;
        this.personStatus = status;
    }

    /**
     * Draws the person
     * 
     * @param g2    the graphics context.
     */
    public void draw(Graphics2D g2)
    {
       Ellipse2D.Double head = new Ellipse2D.Double(this.xCoor-12, this.yCoor-12-18, 24, 24);
       Ellipse2D.Double face = new Ellipse2D.Double(this.xCoor-9, this.yCoor-9-18, 18, 18);
       Rectangle2D.Double body = new Rectangle2D.Double(this.xCoor-1.5, this.yCoor-18, 3, 36);
       Line2D.Double leftArm;
       if (this.personStatus == 0)
       {
           Point2D.Double leftTopArm = new Point2D.Double(this.xCoor-1.5, this.yCoor-18);
           Point2D.Double leftBotArm = new Point2D.Double(this.xCoor-4, this.yCoor);
           leftArm = new Line2D.Double(leftTopArm, leftBotArm);
           Color zombieSkin = new Color(25, 152, 0);
           g2.setColor(zombieSkin);
       }
       else
       {
           Point2D.Double leftTopArm = new Point2D.Double(this.xCoor-1.5, this.yCoor-18);
           Point2D.Double leftBotArm = new Point2D.Double(this.xCoor-4, this.yCoor);
           leftArm = new Line2D.Double(leftTopArm, leftBotArm);
       }
       g2.draw(head);
       g2.fill(head);
       g2.draw(body);
       g2.fill(body);
       g2.draw(leftArm);
       Color faceColor = new Color(255, 218, 142);
       g2.setColor(faceColor);
       g2.draw(face);
       g2.fill(face);
    }

}
