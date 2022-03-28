/*
 * Program/Project: Lab7b
 * Name: Sehee Jang
 * Date: Oct 28, 2020
 * Instructor: Sister Kristi Hays
 * Description: A program that calculates the third side of a right angled triangle based on user input for measurements.
 */
package week07;
import java.util.Scanner;
import java.lang.Math;
/**
 * @author sehee
 *
 */
public class lab7b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner txt = new Scanner(System.in);
		String sAnswer;
		boolean sideAnswerTrue = false;
		Integer a = 0;
		String ansW;
		boolean gameRun = false;
		
		
		System.out.println("This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides.");
		System.out.println("The program will ask the user which side they wish to calculate and the lengths of the other two sides.");
		System.out.println("Assume that the three sides are called a, b, and c where c is the hypotenuse (the side opposite the right angle)\r\n");

		do { // Game loop
			do { // Input validation loop side choice
				System.out.println("Which side of the triangle do you wish to calculate? (a/b/c): ");
				sAnswer = txt.nextLine();
				sideAnswerTrue = sAnswer.equalsIgnoreCase("A") || sAnswer.equalsIgnoreCase("B") || sAnswer.equalsIgnoreCase("C");
				if(!sideAnswerTrue) {
					System.out.println("Invalid Response. Please enter either a,b,or c.");
				}
			} while (!sideAnswerTrue);
			
			//Answer for A,B,C
			if(sAnswer.equalsIgnoreCase("A")) {
				calculateSideA();
			}
			if(sAnswer.equalsIgnoreCase("B")) {
				calculateSideB();
			}
			if(sAnswer.equalsIgnoreCase("C")) {
				calculateSideC();
			}
			
			do { // Replay validation loop
				System.out.println("Do you want to play again?: ");
				ansW = txt.nextLine();
				gameRun = ansW.equalsIgnoreCase("Y") || ansW.equalsIgnoreCase("N");
				if(!gameRun) {
					System.out.println("Error: Please answer with 'Y' or 'N'.");
				}
			} while (!gameRun);
		} while (gameRun = ansW.equalsIgnoreCase("Y"));
	} // end of main

	public static int getSideLength(String x) { //Function method that gets remaining based on input.
		Scanner num = new Scanner(System.in);
		boolean valid = false;
		int sideLength = 0;
		do {
			System.out.println("Pease enter the length of side " + x + ":");
			if(!num.hasNextInt()) {
				System.out.println("Invalid Response. Please enter a whole number.");
			}
			sideLength = num.nextInt();
			valid = true;
		} while(!valid);
		return sideLength;
	}
	
	public static void calculateSideA() { // Calculates side a with input on side b and c
		int b = 0;
		int c = 0;
		double x = 0;
		
		b = getSideLength("b");
		c = getSideLength("c");
		x = Math.sqrt(Math.pow(b,2) + Math.pow(c,2));
		
		System.out.println("A right triagle with the side 'b' = " + b + " and 'c' (hypotenuse) = " + c + ", has a side 'a' which has a length of: " + x);
	}
	
	public static void calculateSideB() { // Calculates side b with input on side a and c
		int a = 0;
		int c = 0;
		double y = 0;
		
		a = getSideLength("a");
		c = getSideLength("c");
		y = Math.sqrt(Math.pow(a,2) + Math.pow(c,2));
		
		System.out.println("A right triagle with the side 'a' = " + a + " and 'c' (hypotenuse) = " + c + ", has a side 'b' which has a length of: " + y);
	}
	
	public static void calculateSideC() { // Calculates side b with input on side a and c
		int a = 0;
		int b = 0;
		double z = 0;
		
		a = getSideLength("a");
		b = getSideLength("b");
		z = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		
		System.out.println("A right triagle with the side 'a' = " + a + " and 'b' (hypotenuse) = " + b + ", has a side 'c' which has a length of: " + z);
	}
} // end of class
