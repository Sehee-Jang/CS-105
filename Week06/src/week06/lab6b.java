/*
 * Program/Project: Lab6b
 * Name: Sehee Jang
 * Date: Oct 21, 2020
 * Instructor: Sister Kristi Hays
 * Description: Ask for numbers and consider the power
 */
package week06;
import java.util.Scanner;

/**
 * @author sehee
 *
 */
public class lab6b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		boolean valid = false;
		String input = "";
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("Num1: ");
			num1 = inputValidation();
			
			System.out.println("Num2: ");
			num2 = inputValidation();
			
			System.out.print("bla bla " + power(num1,num2));
			
			do {
				// Ask the user if they want to play again.
				System.out.print("\nWould you like to play again? (Y/N): ");
				input = scan.next();
				
				// If user input is valid 'Y' or 'N', exit validation loop.
				if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
					
					// If user input is not valid 'Y' or 'N', print error. Stay in loop.
				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.");
				}
			} while (!valid);
			
			// If input was 'N', exit Primary program loop.
			
		} while (!input.equalsIgnoreCase("N"));
		
		scan.close();
	} // end of main

	public static int power(int x, int y) {
		for(int i = 1; i <= y; i++) {
			x = x * x;
		}
		
		return x;
		// TODO Auto-generated method stub
		
	}

	// Asking the user for a whole number and returning a valid whole number
	public static int inputValidation() {
		String input ="";
		boolean valid = false;
		int validNum = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Please enter a whole number: ");
			input = in.nextLine();
			
			try {
				validNum = Integer.parseInt(input);
				valid = true;
			} catch (Exception e) {
				System.out.print("Not valid. Please enter a whole number.");
			}
		} while(!valid);
		
		return validNum;
		
	}
	
} // end of class
