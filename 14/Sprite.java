/**
 * Sprite.java
 *
 * Class to model an agent that moves about the grid.
 * 
 * @author Thomas VanDrunen
 * CSCI 235, Wheaton College, Fall 2019
 * Lab 14
 * 
 */

import simulation.*;
import java.awt.*;

public class Sprite implements Agent {

    /**
     * The current position of the sprite.
     */
    private int xPos, yPos;

    /**
     * Direction in radians, 0 being straight right
     */
    private double direction;

    /**
     * The "rotational velocity", in radians per unit time
     */
    private double rotational;

    /**
     * The velocity, in grid positions per unit time
     */
    private double velocity;

    /**
     * The Sprite's color
     */
    private Color color;

    /**
     * How many turns has this taken? We keep track of
     * this so that we can normalize the coordinates every so
     * often.
     */
    private int turnCounter;

    /**
     * The grid this Sprite inhabits
     */
    private SimulationGrid<Sprite> grid;

     /**
     * Constructor.
     * @param xPos       The x position of this sprite.
     * @param yPos       The y position of this sprite.
     * @param direction  The angle (in radians, east is 0.0) of its movement.
     * @param rotational The angular velocity (change in angle) of this sprite.
     * @param velocity   The speed at which this sprite is moving.
     * @param color      The color in which to show this sprite.
     * @param grid       The grid in which this sprite moves.
     */
    public Sprite(int xPos, int yPos, 
		 double direction, double rotational, double velocity,
		 Color color, SimulationGrid<Sprite> grid) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
        this.rotational = rotational;
        this.velocity = velocity;
        this.color = color;
        this.grid = grid;
        turnCounter = 0;
    }

    /**
     * Take a turn. Find our new position and move to it;
     * change our direction based on our rotational 
     * velocity.
     */
    public void act() { 
        
        turnCounter++;
         
        // hack to avoid overflow.
        // every 25 turns, "normalize" our coordinates
        if (turnCounter > 25) {
            xPos = grid.xNorm(xPos);
            yPos = grid.yNorm(yPos);
            turnCounter = 0;
        }
        // end hack
        
        // Compute the new position; don't move if
        // the new intended position is already occupied
        int xDel = (int) Math.round(velocity * Math.cos(direction));
        int yDel = (int) Math.round(velocity * Math.sin(direction));
        if (grid.isOpen(xPos + xDel, yPos + yDel) || 
            (xDel == 0 && yDel == 0)) {
            grid.setAgentAt(xPos, yPos, null);
            xPos += xDel;
            yPos += yDel;
            grid.setAgentAt(xPos, yPos, this);
        }
   
        // change our direction
        direction += rotational;

        // keep the direction between 0 and 2pi
        if (direction > Math.PI * 2)
            direction -= Math.PI * 2;

    }
    
    public Color getColor() {  return color; }

    public String getIcon() { return ""; }

}
