import javax.swing.JFrame;

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
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400, 400);
        frame.setTitle("A target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }

}
