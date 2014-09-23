import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Write a description of class TargetViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SizeTargetViewer
{

    /**
     * Default constructor for objects of class TargetViewer
     */
    public static void main(String[] args) throws InterruptedException
    {
        int count = 0;
        
        JFrame frame = new JFrame();
        
        frame.setSize(400, 400);
        frame.setTitle("A resizable target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SizeTargetComponent component = new SizeTargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
      
    }

}
