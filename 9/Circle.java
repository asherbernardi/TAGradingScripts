/**
 * Circle.java
 * 
 * Class to represent a circle
 *
 * @author Anna Brandle 
 * CSCI 235, Wheaton College, Fall 2019
 * Lab 8
 * 10/24/19
 */

public class Circle implements Shape {

	/**
	* The radius of the circle
	*/

	private double radius;


	/**
     * Constructor for initializing a Circle's instance variables.
     * @param radius The value for radius
     * @param circumference The value for circumference 
     */

	public Circle(double radius){
		this.radius = radius;
	}

	/**
     * Return the perimeter of the circle.
     * The perimeter of this circle is the radius times 2 times pi.
     * @return    
     */ 
    public double getPerimeter() {
		return (radius*2*Math.PI);
    }

    /**
     * Return the area of this circle.
     * The area of this rectangle is pi times radius squared.
     * @return    
     */ 
    public double getArea() {
		return (radius*radius*Math.PI);
    }

    /**
    * Make the double into a string.
    */

    public String toString() {
    	return this.radius + "";
    }
}
