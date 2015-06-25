package city;

import java.awt.Graphics;

/**
 * 
 * Example class that implements an abstract class using the extends keyword. 
 * The abstract class being extended is called the super class and the new class is the sub class.
 * No constructors, variables etc. need be added if the sub-class is a strict implementation of superclass
 * 
 * @author @mhoel
 * @version 25 July 2015
 * 
 */

public class CityHouse extends CityBuildingAbstract {
	
	// Added a default constructor (although not necessary as it is not different from abstract class)
	public CityHouse() {
		
		// calls the constructor of the superclass
		// superclass methods can be called using super.method() 
		super();
		
	}
	
	// Added a custom constructor that draws upon instantiating
	public CityHouse(Graphics g, int x, int y, int w, int d) {
		
		// this refers to current instance of class
		this.setX(x);
		this.setY(y);
		this.setWidth(w);
		this.setDepth(d);
		
		// calls the super class draw method.
		// you can also use the this.draw(); this refers to the current instance object
		super.draw(g);
	}
	
}
