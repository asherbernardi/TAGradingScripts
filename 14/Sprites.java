/**
 * Sprites.java
 *
 * Program to show sprites moving across a world, letting
 * users add sprites.
 *
 * @author TVD/CGG
 * CSCI 235, Wheaton College, Fall 2019
 * Lab 14
 * 
 */


import simulation.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Sprites {

    

    public static void main(String[] args) {
	Sprites x = new Sprites();
    }


    private View view;
    private SimulationGrid<Sprite> model;   // The grid which Sprites inhabit
    
    private boolean isRunning;
    private static final int STEP_TIME = 250;
    private javax.swing.Timer t;

    private int height, width;  // The dimensions of the grid

    public Sprites() {

	isRunning = false;
	t = new javax.swing.Timer(STEP_TIME, new AbstractAction() {
		public void actionPerformed(ActionEvent e) {
		    runStep();
		}
	    });

	height = 120;
        width = 180;

        model = new SimulationGrid<Sprite>(width, height, 
				      new Sprite[width][height], true);
	// initial population
	addSprite(100, 100,
		  .25 * Math.PI, .125 * Math.PI, 3,
		  Color.RED);

        // Window to display the grid
        SimWindow window = new BVWindow(width, height, model);
        view = window.getView();  

        JButton button = window.getButton();  // button to add sprites
        button.setText("Add Sprite");
        button.addActionListener(new AddListener(this));

	view.display();
	start();
    }

    /**
     * Add a new sprite to this simulation.
     * @param xPos       The x position of this sprite.
     * @param yPos       The y position of this sprite.
     * @param direction  The angle (in radians, east is 0.0) of its movement.
     * @param rotational The angular velocity (change in angle) of this sprite.
     * @param velocity   The speed at which this sprite is moving.
     * @param color      The color in which to show this sprite.
     */
    public void addSprite(int xPos, int yPos, 
			  double direction, double rotational, double velocity,
			  Color color) {
	Sprite s = new Sprite(xPos, yPos,
			      direction, rotational, velocity,
			      color,
			      model);
	model.setAgentAt(xPos, yPos, s);
    }

    private void step() {
	HashSet<Sprite> movedAlready = new HashSet<Sprite>();
	for (int i = 0; i < width; i++)
	    for (int j = 0; j < height ; j++) {
		Sprite  current = model.getAgentAt(i, j);
		if (current != null 
		    && !(movedAlready.contains(current))) {
		    current.act();
		    movedAlready.add(current);
		}
	    }
	view.display();
    }

    private void runStep() {
	if (isRunning) {
	    step();
	}
    }

    public void start() {
	isRunning = true;
	t.start();
    }

    public void stop() {
	isRunning = false;
	t.stop();
    }

}
