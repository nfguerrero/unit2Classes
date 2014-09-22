import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Write a description of class TargetViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetViewer
{

    /**
     * Default constructor for objects of class TargetViewer
     */
    public static void main(String[] args) throws InterruptedException
    {
        int count = 0;
        
        JFrame frame = new JFrame();
        
        frame.setSize(400, 400);
        frame.setTitle("A target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
        
        while (count < 10)
        {
            frame.repaint();
            Thread.sleep(1000);
            count += 1;
        }
    }

}
