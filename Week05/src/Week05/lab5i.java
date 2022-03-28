/*
 * Program/Project: Lab5i
 * Name: Sehee Jang
 * Date: Oct 14, 2020
 * Instructor: Sister Kristi Hays
 * Description: Process a Range of Validated Numbers
 */
package Week05;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab5i {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use Scanner for getting input from user
				Scanner nIn = new Scanner(System.in); // Input Scanner for numbers
				Scanner sIn = new Scanner(System.in); // Input Scanner for Yes or No
		
		//Initialize variables with appropirate value
		String input = "";
		
		boolean valid = false;
		boolean goAgain = false;
				
		// Primary Do While
		do {
			System.out.print("This program will ask the user for three numbers:\n");
			System.out.print(" * A starting number\n");
			System.out.print(" * An ending number\n");
			System.out.print(" * A multiplier\n");
			System.out.print("The program will multiply each number between the starting number and ending number by the multiplier.\n\n");
		
			// Define the rang
			int startNum = 0;
			int endNum = 0;
			int multiplierNum = 0;
			
			// Numeric input validation do-while for starting number
			do {
				System.out.print("Please enter the starting number: ");
				
				// if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					startNum = nIn.nextInt();
					valid = true;
				} else {
					System.out.print("Error: Please enter a whole number.\n");
					valid = false;
					nIn.next();
				}
			} while (!valid); // if false, run the loop
			
			valid = false; // this resets the validity for the next number.
						
			// Numeric input validation do-while for ending number
			do {
				System.out.print("Please enter the ending number: ");
				
				// if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					endNum = nIn.nextInt();
					valid = true;
				} else {
					System.out.print("Error: Please enter a whole number.\n");
					valid = false;
					nIn.next();
				}
			} while (!valid); // if false, run the loop
			
			valid = false; // this resets the validity for the next number.
			
			// Numeric input validation do-while for multiplier
			do {
				System.out.print("Please enter the multiplier: ");
				
				// if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					multiplierNum = nIn.nextInt();
					valid = true;
				} else {
					System.out.print("Error: Please enter a whole number.\n");
					valid = false;
					nIn.next();
				}
			} while (!valid); // if false, run the loop
			
			System.out.print("\n");
			
			// for loop to run each number between the start and the end number.
			for( int i = startNum; i <= endNum; i++ ) {
				
				// display
				System.out.print("Multiplying " + i + " by " + multiplierNum + " results in: " + i * multiplierNum + "\n");
			}
			
			// Non-Numeric Input Validation do-while Loop
			do {
				valid = false;
				System.out.print("Would you like play again? (Y/N): ");
				input = sIn.next();
				
				// if block to check if initial input is valid
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.print("Error: Please anwswer with a 'Y' or 'N'. \n\n");
					valid = false;
				}
			} while (!valid); // if false, run the loop
			
			// if block to decide to start over again
			if(input.equalsIgnoreCase("Y")) {
				goAgain = true;
				System.out.print("\n\n");
			} else if (input.equalsIgnoreCase("N")) {
				System.out.print("Thanks for playing!");
				
				goAgain = false;
			}
		} while (goAgain);
		
		nIn.close(); // close number scanner;
		sIn.close(); // close string scanner;
					
	} // end of main
	
	
	//lab 5b와 비슷한 구조로 lab5b에서 가져온 코드가 많음

} // end of class
