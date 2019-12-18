/**
 * StaticArrayManip.java
 * 
 * This program exercises operations on an array,
 * and also shows catching exceptions.
 * 
 * @author TVD/CGG/HK and ...
 * Wheaton College, CSCI 235, Fall 2019
 * Lab 4
 * Date?
 */
import java.util.Scanner; 

public class StaticArrayManip {

    // For user input from the keyboard
    static Scanner keyboard;
    
    /**
     * Read an int from the keyboard, with error handling.
     * @param prompt The prompt to display.
     * @return The value read.
     */
    public static int readNextInt(String prompt) {

		while (true) {
	
			try {
				System.out.print(prompt);
				int value = keyboard.nextInt();
				keyboard.nextLine();
				return value;
			}
			catch (Exception e) {
				keyboard.nextLine();
				System.out.println("Please enter an integer");
			}

		}

    }

    public static void main(String[] args) {
	// For printing the possible operations
		final String options = "1. Set a value in the array       " +
                                   "2. Find the average\n" +
							   "3. Find the minimum and maximum   " +
                                   "4. Display the contents\n" +
                               "5. Is it sorted?                  " +
								   "6. Fill the array, randomly\n" +
	                           "9. Quit";            
                                   
		keyboard = new Scanner(System.in);
		int initialSize = readNextInt("Please enter the size of the array--> ");
        int[] a = new int[initialSize];    // array to work on

		System.out.println(options);
        boolean quit = false;          // flag for quitting the do-while loop
        do {
			int query = readNextInt("Your choice--> ");  // user's menu choice

            switch(query) {
				case 1:
					int index = readNextInt("Index--> ");    // index to fill
					int value = readNextInt("Value--> ");   // value to put there
					a[index] = value;
					break;

				case 2: // print average
					int sum = 0;
					for (int i = 0; i < a.length; i += 1) {
						sum += a[i];
					}
					System.out.println("Average: " + (sum / ((double) a.length)));
					break;

				case 3: // print min and max
               

					break;
		
				case 4: // print contents
					for (int i = 0; i < a.length; i += 1) {
						System.out.print(a[i] + " ");
					}
					System.out.println("");
					break;

				case 5: // print whether the array is in ascending order 
					System.out.print("The array is ");
					if (!isSorted(a)) {
						System.out.print("not ");
					}			
					System.out.println("sorted.");
					break;

				case 6: // fill the array with random values
					fillRandom(a);
					break;

				case 9:
					quit = true;
					break;

				default:
					System.out.println("That was not an option.");

            }
        } while(!quit);
    }

    /**
     * Compute the average of elements in the array.
     * @param x The array.
     * @return  The average of the elements in x.
     */
    public static double average(int[] x) {
	// write this
	
		return 0.0; // not usually the correct answer
    }

    
    

    /**
     * Fill the array with random values.
     * @param x The array to fill.
     * POSTCONDITION: x is newly filled with random values.
     */
    public static void fillRandom(int[] x) {
		final int maxValue = 100; // Upper bound on values
		for (int i = 0; i < x.length; i += 1) {
			x[i] = (int) (maxValue * Math.random());
		}
    }

    /**
     * Test whether an array is sorted (in ascending order).
     * @param x The array to test.
     * @return Whether x is sorted.
     */
    public static boolean isSorted(int[] x) {
	// needs to be written


	// not always the right answer
		return true;
    }

    /**
     * Print the elements of an array to the terminal.
     * @param x The array.
     */
    public static void printArray(int[] x) {
	// needs to be written	
	
    }

	
	public static void printMinMax(int[] x) {
		
	}
	
	
	

}

