/**
 * Rectangle.java
 * 
 * Class to represent a rectangle
 *
 * @author HK and Anna Brandle 
 * CSCI 235, Wheaton College, Fall 2019
 * Lab 8
 * 10/24/19
 */

public class Rectangle implements Shape {

    /**
     * The width of this rectangle
     */
    private double width;

    /**
     * The height of this rectangle
     */
    private double height;


    /**
     * Constructor for initializing a Rectangle's instance variables.
     * @param width The value for width
     * @param height The value for height 
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    /**
     * Return the area of this rectangle.
     * The area of this rectangle is the width times the height.
     * @return    
     */ 
    public double getArea() {
		return (width*height);
    }

    /**
     * Return the perimeter of this rectangle.
     * The perimeter of the rectangle is width times 2 plus height times 2. 
     */ 
    public double getPerimeter() {
        return (width*2)+(height*2);
    }
	

    
}
