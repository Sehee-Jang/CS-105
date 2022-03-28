/*
 * Program/Project: Lab6a
 * Name: Sehee Jang
 * Date: Oct 19, 2020
 * Instructor: Sister Kristi Hays
 * Description: largestNumber()
 */
package week06;
import java.util.Scanner;

/**
 * @author sehee
 *
 */
public class lab6a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nIn = new Scanner(System.in); // Scanner for integers
		Scanner sIn = new Scanner(System.in); // Scanner for strings of Yes or No
		
		//Initialize variables with appropriate values
		String input = "";
		boolean valid = false;
		boolean playAgain = false;
		
		do {
			System.out.print("This program will ask the user for three numbers and determine which of the three is the largest.");
			System.out.print("\n\n");
			
			// Define the range
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int largestNum = 0;
			
			// Numeric input validation do-while loop for the first number
			do {
				System.out.print("Enter the first number: ");
				// if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					num1 = nIn.nextInt();
					valid = true;
				} else {
					System.out.print("Invalid response: Please enter a whole number.\n\n");
					valid = false;
					nIn.next();
				}
			} while (!valid); // if false, run the loop
			valid = false; // this resets the validity for the next number.
			
			// Numeric input validation do-while loop for the second number
			do {
				System.out.print("Enter the second number: ");
				// if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					num2 = nIn.nextInt();
					valid = true;
				} else {
					System.out.print("Invalid response: Please enter a whole number.\n\n");
					valid = false;
					nIn.next();
				}
			} while (!valid); // if false, run the loop
			valid = false; // this resets the validity for the next number.
			
			// Numeric input validation do-while loop for the third number
			do {
				System.out.print("Enter the third number: ");
				// if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					num3 = nIn.nextInt();
					valid = true;
				} else {
					System.out.print("Invalid response: Please enter a whole number.\n\n");
					valid = false;
					nIn.next();
				}
			} while (!valid); // if false, run the loop
			valid = false; // this resets the validity for the next number.
			
			// Passing the numbers to my method and saving result to the local variable
			largestNum = largestNumber(num1, num2, num3);
			
			// Printing the result
			System.out.print("\n");
			System.out.print("The largest of the three numbers is: " + largestNum + "\n\n");
			
			// Non-Numeric Input Validation do-while loop
			do {
				valid = false;
				System.out.print("Would you like to play again?: ");
				input = sIn.next();
				
				//if block to check if initial input is valid
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;		
				} else {
					System.out.print("Invalid response: please answer with a 'Y' or 'N'. \n\n");
					valid = false;
				}
			} while (!valid); // if false, run the loop
			
			// if block to decide to start over again or say good bye
			if(input.equalsIgnoreCase("Y")) {
				playAgain = true;
				System.out.print("\n\n.");
			} else if (input.equalsIgnoreCase("N")) {
				System.out.print("Thank you for playing.");
				playAgain = false;
			} 
		} while(playAgain);
		
		nIn.close(); // close the number scanner
		sIn.close(); // close the string scanner
		
	} // end of main

	public static int largestNumber(int i, int j, int k) {
		int l = 0;
		
		// determine which number is bigger
		if (i >= j && i >= k)
			l = i;
		else if (j >= i && j >= k)
			l = j;
		else if (k >= i && k >= j)
			l = k;
		else
			System.out.print("Error of some sort");
		return l;
	} //end of method largestNumber()
	
} // end of class
