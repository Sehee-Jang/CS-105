/*Program/Project: Lab2c Practice
 * Name: Sehee Jang
 * Date: September 25, 2020
 * Instructor: Sister Kristi Hays
 *  Description: Calculating Area
 */
package week02;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab2c_practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String input;
		
		int sqWidth;
		int recWidth;
		int recHeight;
		
		int sqArea;
		int recArea;
		
		System.out.println("Please enter the width of the square: ");
		input = in.nextLine();
		sqWidth = Integer.parseInt(input);
		
		System.out.println("Please enter the with of the rectangle: ");
		input = in.nextLine();
		recWidth = Integer.parseInt(input);
		
		System.out.println("Please enter height of the rectangle: ");
		input = in.nextLine();
		recHeight = Integer.parseInt(input);
		
		
		
		//Calculate Area
		sqArea = sqWidth * sqWidth;
		recArea = recWidth * recHeight;
		
		//Output
		System.out.println("The area a square with a with of " + sqWidth + " is " + sqArea + ".");
		System.out.println("The area of a rectangle with a width of " + recWidth + " is " +recArea + ".");
	
		
	}

}
