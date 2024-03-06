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
    /*
    private static final double XPOS = 300.0;   //horizonatal center of lollipop
    private static final double YPOS = 180.0;   //vertical center of lollopop
    private static final double STICK = 200.0;  // length of lollipop stick
    private static final double SIZE = 80.0;    //size of lollipop
    */

    /**
     * Constructor for objects of class Lollipop
     */
    public Lollipop()
    {
        // initialise instance variables
        UI.initialise();    //bring up the UI
        UI.addButton("Draw", this::drawLollipops );  //call the drawLollipop method 
        UI.addButton("Quit", UI::quit);     //quit method
    }

    /**
     * Draw a lollipop 
     *
     */
    public void doDrawLollipop(double x, double y, double size, double stick) {
        //Declare variables
        double left = x - size/2;   //left most position of lollipop
        double top = y - size/2;    //top of most pos of lollipop
        double bottom = y + stick;  // bottom of most pos of lollipop
        
        //Draw the stick
        UI.setColor(Color.black); 
        UI.setLineWidth(size/8.0);      //stick 1/8th size of lollipop
        UI.drawLine(x, y, x, bottom); 
        
        //Draw the lollipop
        UI.setLineWidth(1.0);
        UI.setColor(Color.red);
        UI.fillOval(left, top, size, size);
    }
    
    /**
     * Call the doDrawLollipop method with a number of different parameters
     * 
     */
    public void drawLollipops (){
        //Aks user for diameter
        double diameter = UI.askDouble ("Diameter: ");
        
        
        this.doDrawLollipop(300, 180, diameter, 200);  
        this.doDrawLollipop(100, 80, diameter/3, 30);  
        this.doDrawLollipop(200, 100, diameter/2, 100);  
        this.doDrawLollipop(400, 160, diameter/2, 100);  
    }
}

