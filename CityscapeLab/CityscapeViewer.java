import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author nfguerrero
 * @version 10/1/2014
 */
public class CityscapeViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(800 , 600);
        frame.setTitle("Zombie Apocolypse!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CityscapeComponent component = new CityscapeComponent();
        frame.add(component);

        frame.setVisible(true);
    }

}
