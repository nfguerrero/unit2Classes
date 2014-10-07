import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Creates a person based on its status.
 * 
 * @author nfguerrero 
 * @version 10/6/14
 */
public class Person
{
    private int xCoor;
    private int yCoor;
    private int personStatus;
    private double armRight = 0;
    /**
     * Default constructor for objects of class Person
     * 
     * @param x             the x-coordinate of the middle of the body
     * @param y             the y-coordinate of the middle of the body
     * @param status        0 = zombie, 1 = wimp, 2 = marine, 3 = dead zombie
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
       Rectangle2D.Double body = new Rectangle2D.Double(this.xCoor-1.5, this.yCoor-6, 3, 30);
       Rectangle2D.Double waist = new Rectangle2D.Double(this.xCoor-6.5, this.yCoor+21, 13, 3);
       Rectangle2D.Double leftLeg = new Rectangle2D.Double(this.xCoor-6.5, this.yCoor+24, 3, 15);
       Rectangle2D.Double rightLeg = new Rectangle2D.Double(this.xCoor+3.5, this.yCoor+24, 3, 15);
       Rectangle2D.Double leftEye;
       Rectangle2D.Double rightEye;
       Ellipse2D.Double mouth;
       Rectangle2D.Double leftArm;
       Rectangle2D.Double rightArm;
       Rectangle2D.Double leftForeArm;
       Rectangle2D.Double rightForeArm;
       Rectangle2D.Double gunBarrel;
       Rectangle2D.Double grip;
       Rectangle2D.Double stock;
       Color skinColor;
       Color faceColor;
       Color gunColor;
       if (this.personStatus == 0)
       {
           leftArm = new Rectangle2D.Double(this.xCoor-14+this.armRight, this.yCoor-3.5, 12.5, 3);
           rightArm = new Rectangle2D.Double(this.xCoor-14+this.armRight, this.yCoor+1.5, 12.5, 3);
           rightForeArm = new Rectangle2D.Double(this.xCoor-14+this.armRight, this.yCoor+1.5, 12.5, 3);
           leftForeArm = new Rectangle2D.Double(this.xCoor-14+this.armRight, this.yCoor-3.5, 12.5, 3);
           gunBarrel = new Rectangle2D.Double(this.xCoor-14+this.armRight, this.yCoor-3.5, 12.5, 3);
           grip = new Rectangle2D.Double(this.xCoor-14+this.armRight, this.yCoor-3.5, 12.5, 3);
           stock = new Rectangle2D.Double(this.xCoor-14+this.armRight, this.yCoor-3.5, 12.5, 3);
           leftEye = new Rectangle2D.Double(this.xCoor-5.5, this.yCoor-22, 3, 2);
           rightEye = new Rectangle2D.Double(this.xCoor+2.5, this.yCoor-22, 3, 2);
           mouth = new Ellipse2D.Double(this.xCoor-4, this.yCoor-17, 8, 4);
           skinColor = new Color(25, 152, 0);
           faceColor = Color.GREEN;
           gunColor = new Color(25, 152, 0);
       }
       else
       {
           if(this.personStatus == 1)
           {
               leftArm = new Rectangle2D.Double(this.xCoor-16, this.yCoor-3.5, 14.5, 3);
               rightArm = new Rectangle2D.Double(this.xCoor-1.5, this.yCoor-3.5, 12.5, 3);
               rightForeArm = new Rectangle2D.Double(this.xCoor+8, this.yCoor-.5, 3, 10);
               leftForeArm = new Rectangle2D.Double(this.xCoor+8, this.yCoor-.5, 3, 10);
               gunBarrel = new Rectangle2D.Double(this.xCoor-21, this.yCoor-4.5, 10, 2);
               grip = new Rectangle2D.Double(this.xCoor-13, this.yCoor-2.5, 2, 6);
               stock = new Rectangle2D.Double(this.xCoor-13, this.yCoor-2.5, 2, 6);
               leftEye = new Rectangle2D.Double(this.xCoor-5.5, this.yCoor-22, 3, 2);
               rightEye = new Rectangle2D.Double(this.xCoor+2.5, this.yCoor-22, 3, 2);
               mouth = new Ellipse2D.Double(this.xCoor-3.5, this.yCoor-17, 7, 2);
               skinColor = Color.RED;
               faceColor = new Color(255, 218, 142);
               gunColor = Color.GRAY;
           }
           else
           {
               leftArm = new Rectangle2D.Double(this.xCoor-14, this.yCoor-3.5, 14.5, 3);
               rightArm = new Rectangle2D.Double(this.xCoor-1.5, this.yCoor-3.5, 12.5, 3);
               rightForeArm = new Rectangle2D.Double(this.xCoor+8, this.yCoor-.5, 3, 10);
               leftForeArm = new Rectangle2D.Double(this.xCoor-14, this.yCoor-.5, 3, 10);
               gunBarrel = new Rectangle2D.Double(this.xCoor-17.5, this.yCoor+5, 33, 2);
               grip = new Rectangle2D.Double(this.xCoor+8.5, this.yCoor+7, 2, 6);
               stock = new Rectangle2D.Double(this.xCoor-13.5, this.yCoor+7, 2, 6);
               leftEye = new Rectangle2D.Double(this.xCoor-5.5, this.yCoor-22, 3, 2);
               rightEye = new Rectangle2D.Double(this.xCoor+2.5, this.yCoor-22, 3, 2);
               mouth = new Ellipse2D.Double(this.xCoor-3.5, this.yCoor-17, 7, 2);
               skinColor = Color.BLUE;
               faceColor = new Color(255, 218, 142);
               gunColor = Color.GRAY;
           }
       }
       
       g2.setColor(gunColor);
       g2.draw(grip);
       g2.fill(grip);
       g2.draw(stock);
       g2.fill(stock);
       g2.setColor(skinColor);
       g2.draw(head);
       g2.fill(head);
       g2.draw(body);
       g2.fill(body);
       g2.draw(leftArm);
       g2.fill(leftArm);
       g2.draw(rightArm);
       g2.fill(rightArm);
       g2.draw(rightForeArm);
       g2.fill(rightForeArm);
       g2.draw(waist);
       g2.fill(waist);
       g2.draw(leftLeg);
       g2.fill(leftLeg);
       g2.draw(rightLeg);
       g2.fill(rightLeg);
       g2.setColor(faceColor);
       g2.draw(face);
       g2.fill(face);
       g2.setColor(Color.BLACK);
       g2.draw(leftEye);
       g2.fill(leftEye);
       g2.draw(rightEye);
       g2.fill(rightEye);
       g2.draw(mouth);
       g2.fill(mouth);
       g2.setColor(gunColor);
       g2.draw(gunBarrel);
       g2.fill(gunBarrel);
       g2.setColor(skinColor);
       g2.draw(leftForeArm);
       g2.fill(leftForeArm);
    }
    
    /**
     * Turns the person right(only works on Zombie...)
     */
    public void turnRight()
    {
        this.armRight = 15.5;
    }
}


