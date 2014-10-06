import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author nfguerrero
 * @version 10/1/2014
 */
public class CityscapeComponent extends JComponent
{
    public static int gap;
    private int x;
    private int y;
    /**
     *Default constructor for objects of class CityscapeComponent
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        this.x = getWidth()/8;
        this.y = getHeight()/6;
        this.gap = getWidth()/8;
        
        Building build1 = new Building(0, this.y*2, this.x, this.y*3);
        Building build2 = new Building(this.x, this.y*2, this.x, this.y*3);
        Building build3 = new Building(this.x*2, this.y*2, this.x, this.y*3);
        Building build4 = new Building(this.x*3, this.y*2, this.x, this.y*3);
        Building build5 = new Building(this.x*4, this.y*2, this.x, this.y*3);
        Building build6 = new Building(this.x*5, this.y*2, this.x, this.y*3);
        Building build7 = new Building(this.x*6, this.y*2, this.x, this.y*3);
        Building build8 = new Building(this.x*7, this.y*2, this.x, this.y*3);
        Road road = new Road(this.x, this.y*5, this.x*6, this.y);
        Building buildLeft = new Building(0, this.y*3, this.x, this.y*3);
        Building buildRight = new Building(this.x*7, this.y*3, this.x, this.y*3);
        Sky sky = new Sky(getWidth(), getHeight()-this.y*4);
        Person zombie1 = new Person(600, 500, 0);
        Person zombie2 = new Person(300, 500, 0);
        Person wimp = new Person(425, 500, 1);
        Person marine = new Person(475, 500, 2);
         
        sky.draw(g2);
        build1.draw(g2);
        build2.draw(g2);
        build3.draw(g2);
        build4.draw(g2);
        build5.draw(g2);
        build6.draw(g2);
        build7.draw(g2);
        build8.draw(g2);
        buildLeft.draw(g2);
        buildRight.draw(g2);
        road.draw(g2);
        zombie1.draw(g2);
        zombie2.turnRight();
        zombie2.draw(g2);
        wimp.draw(g2);
        marine.draw(g2);
        
    }

}
