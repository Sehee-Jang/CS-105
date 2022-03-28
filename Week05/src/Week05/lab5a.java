/*
 * Program/Project: Lab5a
 * Name: Sehee Jang
 * Date: Oct 12, 2020
 * Instructor: Sister Kristi Hays
 * Description: Whole Numbers Divisible by X
 */
package Week05;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab5a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Use the scanner for getting input from user
		Scanner nIn = new Scanner(System.in); // Input scanner for number
		Scanner sIn = new Scanner(System.in); // Input scanner for Yes or No
		
		// Initialize variables with appropriate value
		String input = "";
		boolean valid = false;
		boolean playAgain = false;
		
		// Primary Do While
		do {
			System.out.print("In this program, we will display s series of numbers divisible by an ineger specified by the user.\nYou will ask the user for the starting number, the ending number, and the integer to be considered.");
			
			//Define the range
			int startNum = 0;
			int endNum = 0;
			int testNum = 0;
			
			//Numeric input validation do-while loop for starting number
			
			do {
				System.out.print("Enter the starting number: ");
				//if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					startNum = nIn.nextInt();
					valid = true;
				} else {
					System.out.print("Error! Please enter a whole number.\n\n");
					valid = false;
					nIn.next();
				}
			} while (!valid); // if false, run the loop
			
			valid = false; // this resets the validity for the next number
			
			//Numeric input validation do-while loop for ending number
			
			do {
				System.out.print("Enter the ending number: ");
				//if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					endNum = nIn.nextInt();
					valid =  true;
				} else {
					System.out.print("Error! Please enter a whole number.\n\n");
					valid = false;
					nIn.hasNext();
				}
				
			} while (!valid); // if false, run the loop
			valid = false; // this reset the validity for the next number
			
			// Numeric input validation do while loop for test number
			do {
				System.out.print("Enter the test number: ");
				//if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					testNum = nIn.nextInt();
					valid =  true;
				} else {
					System.out.print("Error! Please enter a whole number.\n\n");
					valid = false;
					nIn.hasNext();
				}
				
			} while (!valid); // if false, run the loop
			System.out.print("Here are the numbers between " + startNum + " and " + endNum + " that are divisible by " + testNum + ":\n");
			
			// for loop to run each number between the start and the end
			for (int i = startNum; i <= endNum; i++) {
				
				// if block to decide to only print the whole numbers
				if ( (i % testNum) == 0)
					System.out.print(i + "\n");
			}
			
			// Non-numeric input validation do-while loop
			do {
				valid = false;
				System.out.print("Would you like to play again?: ");
				input = sIn.next();
				
				// if block to check if initial input is valid
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.print("Error: Please answer with a 'Y' or 'N'. \n\n");
					valid = false;
				}
			} while (!valid); // if false, run the loop
			
			// if block to decide to start game over or say good bye
			if(input.equalsIgnoreCase("Y")) {
				playAgain = true;
				System.out.print("\n\n");
			} else if (input.equalsIgnoreCase("N")) {
				System.out.print("Thanks for playing!");
			}
		} while (playAgain);
		
		nIn.close(); // close number scanner
		sIn.close(); // close string scanner

	} // end of main

} // end of class
