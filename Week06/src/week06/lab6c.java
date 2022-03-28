/*
 * Program/Project: Lab6c
 * Name: Sehee Jang
 * Date: Oct 21, 2020
 * Instructor: Sister Kristi Hays
 * Description: Tells you whether the test number
 */
package week06;
import java.util.Scanner;

/**
 * @author sehee
 *
 */
public class lab6c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in); // Scanner for numbers
		Scanner txt = new Scanner(System.in); // Scanner for strings for Yes or No
		String ansW;
		Integer lowNum = 0;
		Integer testNum = 0;
		Integer highNum = 0;
		boolean lowTrue = false;
		boolean testTrue = false;
		boolean highTrue = false;
		boolean gameRun = false;
		
		System.out.println("This program will ask the user for 3 numbers and determine if the second number lies between the first and the third.");
		
		do {
			do { //Nuber 1 loop
				System.out.println("Plese enter the low number: ");
				if (num.hasNextInt()) {
					lowNum = num.nextInt();
					lowTrue = true;
					num.nextLine();
				} else {
					lowTrue = false;
					System.out.println("Error: Please enter a whole number.");
					num.nextLine();
				}
			} while (!lowTrue);
			
			do { //Nuber 2 loop
				System.out.println("Please enter the number to be tested (the between number): ");
				if (num.hasNextInt()) {
					testNum = num.nextInt();
					testTrue = true;
					num.nextLine();
				} else {
					testTrue = false;
					System.out.println("Error: Please enter a whole number.");
					num.nextLine();
				}
			} while (!testTrue);
			
			do { //Nuber 3 loop
				System.out.println("Please enter the high number: ");
				if (num.hasNextInt()) {
					highNum = num.nextInt();
					highTrue = true;
					num.nextLine();
				} else {
					highTrue = false;
					System.out.println("Error: Please enter a whole number.");
					num.nextLine();
				}
			} while (!highTrue);
			
			if (isBetween(lowNum, testNum, highNum)) {
				System.out.println(lowNum + " lies between the numbers " + lowNum + " and " + highNum + ".");
			} else {
				System.out.println(testNum + " DOES NOT lie between the numbers " + lowNum + " and " + highNum + ".");
			}
			do {
				System.out.println("Do you want to play again?");
				ansW = txt.nextLine();
				gameRun = ansW.equalsIgnoreCase("Y") || ansW.equalsIgnoreCase("N");
				if(!gameRun) {
					System.out.println("Error: Please answer with 'Y' or 'N'.");
				}
			} while(!gameRun);
		} while(ansW.equalsIgnoreCase("Y"));
	} // end of main

	public static boolean isBetween(int a, int b, int c) {
		return b>a && b<c;
	}
} // end of class
