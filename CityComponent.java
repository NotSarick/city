package city;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 * @version 25 July 2015 (mhoel)
 * 
 */
public class CityComponent extends JComponent
{
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
	
	
    public void paintComponent(Graphics g)
    {
        
        // create instances of classes and invoke the draw method on each
        // ...
        CitySchool ucc = new CitySchool();
        ucc.draw(g);
        
        // object casaloma IS-A CityHouse
        // object casaloma IS-A CityBuildingAbstract as well, because CityHouse inherits from CityBuildingAbstract
        // So the IS-A implies inheritance, HAS-A relationships imply composition (for example, if there was
        // a chimney object, we could say that casaloma HAS-A chimney as the house casaloma has a chimney in its
        // composition. HAS-A can also refer to aggregation relationships
        CityHouse casaloma = new CityHouse();
        casaloma.draw(g);
        
        // CityHouse(Graphics g, int x, int y, int w, int d) is constructor method signature used below
        // g is a Graphics object it is passed by reference using variable name and int parameters passed as values
        CityHouse granthouse = new CityHouse(g, 170,50,200,50);
        
        
        // Use the CityBuildingAbstract getArea method to find the area - this is an example of procedural abstraction
        // In other words, the getArea procedure is a "black box". You use it and get back a value,
        // you don't need to know the inner workings of the function.
        System.out.print("Area\n");  // escape for newline - full list: http://docs.oracle.com/javase/tutorial/java/data/characters.html
        System.out.print(granthouse.getArea());
        
    }

}

