/**
 * Animal.java
 *
 *  Interface to model animals for a pet shop.
 *
 * @author TVD
 * CSCI 235, Wheaton College, Fall 2019
 * Lab 9
 * 
 */

public interface Animal {

    /**
     * Feed this animal.
     * @param food The kind of food provided.
     * @return Whether the animal eats the food.
     */
    public boolean feed(String food);

    /**
     * Provoke this animal.
     * @return The sound made by the animal.
     */
    public String provoke();
    
    /**
     * Speak a phrase to this animal.
     * @param phrase The phrase to speak.
     */
    public void speakTo(String phrase);
    
    /**
     * Weigh this animal.
     * @return This animal's weight.
     */
    public int weigh();
}
