/*
 * Program/Project: Lab5b
 * Name: Sehee Jang
 * Date: Oct 14, 2020
 * Instructor: Sister Kristi Hays
 * Description: Interest Calculator
 */
package Week05;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab5b {

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
			System.out.print("This program will ask the user for a monthly deposit, an interest rate, and the number of months the user plans on saving. \n");
		
			System.out.print("It will then show the monthly balance over the period of planned savings.");
			
			//Define the range
			double deposit = 0.00;
			double annualRate = 0.00;
			int months = 0;
			double balance = 0.00;
			
			// Numeric input validation do-while for deposit
			do {
				System.out.print("Please enter the amount to be deposited each month: ");
				
				// if block to check if initial input is valid
				if (nIn.hasNextDouble()) {
					deposit = nIn.nextDouble();
					valid = true;
				} else {
					System.out.print("Error: Please enter a whole number.\n");
					valid = false;
					nIn.hasNextLine();
				}
			} while (!valid); // if false, run the loop
			
			valid = false; // this resets the validity for the next number.
			
			// Numeric input validation do-while loop for the interest rate
			do {
				System.out.print("Please enter the annual interest rate: ");
				
				// if block to check if initial input is valid
				if (nIn.hasNextDouble()) {
					annualRate = nIn.nextDouble();
					valid = true;
				} else {
					System.out.print("Error: Please enter a whole number.\n");
					valid = false;
					nIn.hasNextLine();
				}
			} while (!valid); // if false, run the loop
			
			valid = false; // this resets the validity for the next number.
			
			// Numeric input validation do-while loop for months
			do {
				System.out.print("Please enter the number of months you plan to save: ");
				
				// if block to check if initial input is valid
				if (nIn.hasNextInt()) {
					months = nIn.nextInt();
					valid = true;
				} else {
					System.out.print("Error: Please enter a whole number.\n");
					valid = false;
					nIn.hasNextLine();
				}
			} while (!valid); // if false, run the loop
			
			System.out.print("Month\t\tBalance\n");
			
			double monthlyRate = (annualRate/100.00)/12;
			
			// for loop to run each number between the month 1 and the desired number of months
			for( int i = 1; i <= months; i++ ) {
				
				// calculations
				balance += deposit;
				balance *= (1 + monthlyRate);
				
				// display
				System.out.print("Month " + i + ":\t\n\n");
				System.out.printf("Balance is: $%,.2f",balance);
			}
			
			// Non-Numeric Input Validation do-while Loop
			do {
				valid = false;
				System.out.print("Would you like to make another calcuation? (Y/N): ");
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
				System.out.print("Thanks for choosing Ensign Java Bank!");
				
				goAgain = false;
			}
		} while (goAgain);
		
		nIn.close(); // close number scanner;
		sIn.close(); // close string scanner;

	} // end of main

} // end of class
