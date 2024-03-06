import ecs100.*; //import the ecs100 lib
import java.awt.Color; //Use different colours 
/**
 * Class demonstration to draw a lollipop for our first GUI.
 *
 * @author Linh
 * @version  1 (6/3/2024)
 */
public class Lollipop
{
    // instance variables 
    private static final double XPOS = 300.0;   //horizonatal center of lollipop
    private static final double YPOS = 180.0;   //vertical center of lollopop
    private static final double STICK = 200.0;  // length of lollipop stick
    private static final double SIZE = 80.0;    //size of lollipop

    /**
     * Constructor for objects of class Lollipop
     */
    public Lollipop()
    {
        // initialise instance variables
        UI.initialise();    //bring up the UI
        UI.addButton("Draw", this::doDrawLollipop );  //call the drawLollipop method 
        UI.addButton("Quit", UI::quit);     //quit method
    }

    /**
     * Draw a lollipop 
     *
     */
    public void doDrawLollipop() {
        //Declare variables
        
        
        //Draw the stick
        UI.setColor(Color.black); 
        UI.setLineWidth(10.0);
        UI.drawLine(XPOS, YPOS, XPOS, YPOS+STICK); 
        
        //Draw the lollipop
        UI.setLineWidth(1.0);
        UI.setColor(Color.red);
        UI.fillOval(XPOS-SIZE/2, YPOS-SIZE/2, SIZE, SIZE);
    }
}

