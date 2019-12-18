/**
 * PetShop.java
 *
 * Driver for a variety of Animal classes.
 * 
 * @author TVD/CGG/HK and ??
 * CSCI 235, Wheaton College, Fall 2019
 * Lab 9
 * 10/31/19
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class PetShop {

	/**
	 * For reading from the keyboard.
	 */
	private static Scanner keyboard;

	public static void main(String[] args) {
		final int N_CAGES = 4; // how many cages
		keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the pet shop.");
		System.out.println("To leave, select cage -1.");


		Animal[] cages = new Animal[N_CAGES];
		// note: all elements are initially null
		
		for (;;) {
			int cageNum = getBoundedInt("Which cage--> ", -1, N_CAGES-1);
			if (cageNum == -1) {
				break;
			}
			/***** fill cage if empty */
			if (cages[cageNum] == null) {
				cages[cageNum] = fillCage(cageNum);
			}
			int menuChoice = getBoundedInt("1. feed it; 2. speak to it; "
				+"3. provoke it; 4. weigh it\n"
				+"5. tickle it\n"
				+"Your choice--> ",
				1, 5);
			switch (menuChoice) {
				case 1:
				System.out.print("What would you like to feed it? --> ");
				String food = keyboard.nextLine();
				if (cages[cageNum].feed(food))
					System.out.println("It ate the " + food);
				else
					System.out.println("It didn't want the " + food);
				break;
				case 2:
				System.out.print("What would you like to say to it? --> ");
				cages[cageNum].speakTo(keyboard.nextLine());
				break;
				case 3:
				System.out.println(cages[cageNum].provoke());
				break;
				case 4:
				System.out.println("It weighs " + cages[cageNum].weigh() 
					+ " pounds");
				break;
				case 5: // for Monkey only
				Monkey m = (Monkey) cages[cageNum];
				String x = m.tickle();
				System.out.println(x);
				break;
			}
		}
		System.out.println("Good-bye");
	}


	/**
	 * Fill an empty cage with an animal of the user's choosing.
	 * @param keyboard The Scanner to read from.
	 * @param cageNum  The number of the cage to fill.
	 * @return A new Animal to put in the cage.
	 */
	// Correct the code to work for the animals
	private static Animal fillCage(int cageNum) {
		System.out.println("Cage " + cageNum + " is empty.");
		int query = getBoundedInt("Would you like a new "
			+ "1) Monkey 2) Parrot "
			+ "3) Cat? ",
			1, 3);
			switch(query) {
			case 1:
			return new Monkey();
			case 2:
			return new Parrot();
			case 3:
			return new Cat();
			
		}
	// never reached
		return null;
	}




   /**
	 * Prompt and read for an integer in the range low to high.
	 * @param prompt The prompt to print.
	 * @param low    The minimum value to accept.
	 * @param high   The maximum value to accept.
	 * @return The value read.
	 */
   private static int getBoundedInt(String prompt, int low, int high) {
   	while (true) {
   		try {
   			System.out.print(prompt);
   			String s = keyboard.nextLine().trim();
   			int i = Integer.parseInt(s);
   			if (low <= i && i <= high) {
   				return i;
   			}
   			System.out.println("The value must be at least "+low
   				+" and at most "+high+".");
   		}
   		catch (NumberFormatException e) {
   			System.out.println("Input must be an integer.");
   		}
   	}
   }

}
