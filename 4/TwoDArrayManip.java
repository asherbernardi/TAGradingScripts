/**
 * TwoDArrayManip.java
 * 
 * Program description
 * 
 * @author  
 * Wheaton College, CSCI 235, Fall 2019
 * Lab 4
 * Date ?
 */

import java.util.Scanner; 

public class TwoDArrayManip {
    public static void main(String[] args) {

        // For user input from the keyboard
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the size of rows--> ");
		int row = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("Please enter the size of columns--> ");
		int col = keyboard.nextInt();
		keyboard.nextLine();

		int[][] a = new int[row][col];


		boolean quit = false;          // flag for quitting the do-while loop

        do {
            System.out.println("1. Set a value in the array\n" +
                               "2. Find the average\n" +
                               "3. Find the minimum and maximum\n" +
                               "4. Display the contents\n" +
                               "5. Quit");
            System.out.print("Your choice--> ");
            int query = keyboard.nextInt();   // user's menu choice
            keyboard.nextLine();

            switch(query) {
				case 1:
					System.out.print("Index for row--> ");
					int rowIndex = keyboard.nextInt();    
					keyboard.nextLine();
					System.out.print("Index for column--> ");
					int colIndex = keyboard.nextInt();
					keyboard.nextLine();
					System.out.print("Value--> ");
					int value = keyboard.nextInt();   // value to put there
					keyboard.nextLine();
					a[rowIndex][colIndex] = value;
					break;

				case 2:
                
                
					break;

				case 3:
                
		
					break;

				case 4:
                
                
					break;

                
				case 5:
					quit = true;
					break;

				default:
					System.out.println("That wasn't even a choice.");
            }
        } while(!quit);

    }
}

