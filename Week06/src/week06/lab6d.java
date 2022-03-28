/*
 * Program/Project: Lab6d
 * Name: Sehee Jang
 * Date: Oct 21, 2020
 * Instructor: Sister Kristi Hays
 * Description: daysToMillion()
 */
package week06;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab6d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int pennies = 0;
		
		pennies = inputValidation("Please, enter the number of pennies: ");
		// String question = "Please, enter the number of pennies:";
		// pennies = inputValidation(question);
		
		System.out.print("\nThe number of days to reach $1 million is " + daysToMillion(pennies));
		
		
	} // end of main

	private static int daysToMillion(int pennies) {
		// TODO Auto-generated method stub
		int days = 0;
		
		System.out.println("Day              Pennies");
		System.out.println("------------------------");
		System.out.println(days + "\t\t\t\t" + pennies);
		
		while(pennies < 100000000) {
			pennies = pennies * 2;
			days++; // days = days + 1;
			System.out.println(days + "\t\t\t\t" + pennies);
		}
		
		return days;
	}
	
	// Asking the user for a whole number and returning a valid whole number
	public static int inputValidation(String question) {
		String input = "";
		boolean valid = false;
		int validNum = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println(question);
			input = in.nextLine();
			
			try {
				validNum = Integer.parseInt(input);
				valid = true;
			} catch (Exception e) {
				System.out.println("Not Valid. Please enter a whole number.");
			}
			
		} while (!valid);
		
		return validNum;
	}
} // end of class
