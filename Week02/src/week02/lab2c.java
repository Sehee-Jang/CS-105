/*Program/Project: Lab2c
 * Name: Sehee Jang
 * Date: September 25, 2020
 * Instructor: Sister Kristi Hays
 *  Description: Calculating Area
 */
package week02;

import java.util.Scanner;

public class lab2c {

	public static void main(String[] args) {
		
		//Declare Variables
		Scanner in = new Scanner(System.in); // get info from the user
		String input; //
		
		int sqWidth; // store the info provided by the user
		int recWidth; // store the rec width
		int recHeight;	// store the rec height
	
		int sqArea; // store square Area
		int recArea; // store rec Area	
	
		// Input and Calculations
		System.out.println("Please enter the width of the square: ");
		input = in.nextLine(); // "5" -> 5
		sqWidth = Integer.parseInt(input);
		
		// Float.parseFloat("");
		// Double.parseDouble("");
		
		System.out.println("Please enter width of the rectangle:");
		input = in.nextLine(); // "4" -> 4
		recWidth = Integer.parseInt(input);
		
		System.out.println("Please enter height of the rectangle:");
		input = in.nextLine(); // "10" -> 10
		recHeight = Integer.parseInt(input);
		
		// Calculate rec. Area
		recArea = recWidth * recHeight;
		
		// Calculate sq. Area
		sqArea = sqWidth * sqWidth;
		
		// Output
		System.out.println("The area of a square with a width of " + sqWidth + " is " + sqArea); // 25
		System.out.println("The area of a rectangle with a width of " + recWidth + " and a height of " + recHeight +  " is " + recArea + "."); // 40
		
		in.close(); 
	}

}
