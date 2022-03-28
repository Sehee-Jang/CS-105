/*
 * Program: Final Exam 1
 * Name: Sehee Jang
 * Date: Dec 14 2020
 * Instructor: Sister Kristi Hays
 * Description: Strings
 */
package Final;

import java.util.Scanner;

/**
 * @author Sehee Jang
 *
 */
public class FinalExam01 {

	public static void main(String[] args) {
		Scanner sIn = new Scanner(System.in); // Scanner for strings
		Scanner nIn = new Scanner(System.in); // Scanner for integers

		int males = 0;
		int females = 0;
		boolean valid = false;

		System.out.print("Please enter your name: ");
		String name = sIn.nextLine();
		System.out.println();
		
		System.out.print("Please enter the name of your Ward: ");
		String wardname = sIn.nextLine();
		System.out.println();
		
		do {
			System.out.print("Please enter the approximate number of adult males in the ward: ");
			
			if (nIn.hasNextInt()) {
				males = nIn.nextInt();
				valid = true;
				
			} 
			else {
				System.out.print("Invalid response: Please enter a whole number.\n\n");
				valid = false;
				nIn.nextLine();
			}
		} while (!valid); // if false, run the loop

		valid = false;

		do {
			System.out.print("Please enter the approximate number of adult females in the ward: ");

			if (nIn.hasNextInt()) {
				females = nIn.nextInt();
				valid = true;

			} else if (nIn.next() == " ")
				continue;
			else {
				System.out.print("Invalid response: Please enter a whole number.\n\n");
				valid = false;
				nIn.nextLine();
			}
		} while (!valid); // if false, run the loop

		System.out.println();
		System.out.printf("There are " + (males + females) + " adult members in " + name + "'s " + wardname + " ward.");

		sIn.close(); // close the scanner
		nIn.close(); // close the scanner
	} // end of main

} // end of class
