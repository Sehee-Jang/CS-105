/*
 * Program/Project: Lab4c
 * Name: Sehee Jang
 * Date: Oct 07, 2020
 * Instructor: Sister Kristi Hays
 * Description: Non-numeric Input Validation
 */
package Week04;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab4c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The user input needs to be inside the loop so you can change the variable control
		Scanner sln = new Scanner(System.in);
		String ansString = "";
		boolean valid = false;
		
		do { // validate user input
			System.out.println("Do you enjoy coding in Java?: ");
			ansString = sln.nextLine(); // User's answer
			
			if(ansString.equalsIgnoreCase("Y") || ansString.equalsIgnoreCase("N")) {
				valid = true;
			} else {
				System.out.println("Error. Please answer Y for yes or N for no.");
			}	
		} while(!valid);
		
		if(ansString.equalsIgnoreCase("Y") || ansString.equalsIgnoreCase("N")) {
			System.out.println("That's great! I do too!");
		} else {
			System.out.println("That's okay. There are many other wonderful things to learn.");
		}
		
		sln.close(); // to close scanner
	} // end of main

} // end of class
