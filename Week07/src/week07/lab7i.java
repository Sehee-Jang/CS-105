/*
 * Program/Project: Lab7i
 * Name: Sehee Jang
 * Date: Nov 31, 2020
 * Instructor: Sister Kristi Hays
 * Description: Passing an array list to sumValues()
 */
package week07;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Sehee Jang
 *
 */
public class lab7i {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Play the game until the user says they don't want to play again.
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {

		//Get an integer from the user
		int intNum = getValidInt("Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.");
		System.out.printf("The whole number your entered was: %d.\n", intNum);
		System.out.println("Now we will test your whole number in a math equation...");
		System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
		System.out.println();

		//Get a floating-point from the user
		double doubleNum = getValidDouble("Please enter a decimal-point number: ", "Invalid response. Only decimal-point numbers are acceptable.");
		System.out.printf("The float your entered was: %f.\n", doubleNum);
		System.out.println("Now we will test your floating-point number in a math equation...");
		System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
		System.out.println();

		//Get a 'Y' or 'N' from the user
		playAgain = getValidYN("Would you like to play again? (Y/N): ", "Invalid response. Please answer with a 'Y' or 'N'");
		System.out.println();
		}// end of while (playAgain.equalsIgnoreCase("y"))
		}// end of Main()
	
	private static int getValidInt(String question, String warning) {
		boolean valid = false;
		String finalAns = "";
		System.out.println(question);
		Scanner sIn1 = new Scanner(System.in);
		String ans1 = sIn1.next();
		
		try {
			finalAns = sIn1.nextLine();
			Integer.parseInt(finalAns);
			valid = true;
		} catch (Exception e) {
			System.out.println(warning);
			ans1 = sIn1.next();
			valid = false;
		}		
		
		return 0;
	}
	
	private static double getValidDouble(String string, String string2) {

		return 0;
	}



	public static String getValidYN(String question, String warning) {
		boolean valid = false;
		String finalAns = "";
		System.out.println(question);
		Scanner sIn1 = new Scanner(System.in);
		String ans1 = sIn1.next();
		
		do {
			if (ans1.equalsIgnoreCase("Y")) {
				finalAns = ans1;
				valid = true;
			} else if (ans1.equalsIgnoreCase("N")) {
				finalAns = ans1;
				valid = true;
			} else {
				System.out.println(warning);
				ans1 = sIn1.next();
			}
		} while (!valid);
		
		return finalAns;
	}
	
	
} // end of class
