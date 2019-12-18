/**
 * Parrot.java
 *
 * Class to model parrots.
 *
 * @author the previous CSCI 235 class
 * CSCI 235, Wheaton College, Fall 2019
 * Lab 9
 * 
 */


public class Parrot implements Animal {

    private int weight;
    private int provokedness;
    /**
     * Constructor.
     */
    public Parrot() {    
        weight = 1;
	provokedness = 0;
    }
    /**
     * Feed something to this parrot.
     * @param food The kind of food.
     * @return Whether the food is eaten.
     */
    public boolean feed(String food)  {   
	if (food.equals("cracker")) {
	    weight += 1;
	    provokedness -= 1;
	    return true;
	}
	provokedness += 1;
	return false;
    }
    /**
     * Provoke this parrot.
     * @return The sound it makes.
     */
    public String provoke() {        
        provokedness += 1;
	String sound = "squa";
	for (int i = 0; i < provokedness; i++) {
	    sound += "a";
	}
        sound += "wk";
	if (provokedness > 2) {
	    sound = sound.toUpperCase();
	}
	return sound;
    }
    /**
     * Speak a phrase to this parrot.
     * POSTCONDITION: 
     * @param phrase The phrase to speak.
     */
    public void speakTo(String phrase) {     
        
    }
    /**
     * Get the weight of this parrot.
     * @return The weight.
     */
    public int weigh() {       
	return weight;
    }
}
