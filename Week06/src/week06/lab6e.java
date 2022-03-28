/*
 * Program/Project: Lab6e
 * Name: Sehee Jang
 * Date: Oct 24, 2020
 * Instructor: Sister Kristi Hays
 * Description: forReverse() & whileReverse()
 */
package week06;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab6e {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sIn = new Scanner(System.in);
		Scanner sIn2 = new Scanner(System.in);
		
		// Initialize variables with appropriate value
		String input = "";
		String input2 = "";
		
		boolean valid = false;
		boolean playAgain = false;
		String regex = "^[a-zA-Z]*$";	
		
		// Primary Do While
		do {
			System.out.println("This program will ask the user to enter something and then print out a reversed version of the user's input.");
			
			do {
				System.out.print("Please enter something: ");
				if(input.isEmpty()) input = sIn.nextLine(); // User's answer
				
				if (input.matches(regex)) {
					valid = true;
					
					for (int i = input.length()-1; i >= 0; i--){
						System.out.print(input.charAt(i));
					} 
					
					System.out.println();
					
					input = "";
					
				} else {
					System.out.print("Error! Please enter letters.\n\n");
					valid = false;
					sIn.next();
				}
			} while (!valid);
			
			valid = false;

			// Non-numeric input validation do-while loop
			do {
				valid = false;
				System.out.print("Would you like to play again?: ");
				input2 = sIn2.next();
				
				// if block to check if initial input is valid
				if(input2.equalsIgnoreCase("Y") || input2.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.print("Error: Please answer with a 'Y' or 'N'. \n\n");
					valid = false;
				}
			} while (!valid); // if false, run the loop
			
			// if block to decide to start game over or say good bye
			if(input2.equalsIgnoreCase("Y")) {
				playAgain = true;
				System.out.print("\n\n");
			} else if (input2.equalsIgnoreCase("N")) {
				System.out.print("Thanks for playing!");
				playAgain = false;
			}
	
		} while (playAgain);
				
		sIn.close();
		sIn2.close();
	} // end of main

} // end of class
