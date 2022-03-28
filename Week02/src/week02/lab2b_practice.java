/**
 * 
 */
package week02;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab2b_practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please write your name: ");
		String name = in.nextLine();
		System.out.println("Hello " + name + ".");
		
		System.out.println("What is your favorite deserrt?: ");
		String dessert = in.nextLine();
		System.out.println("I hope that you like coding JavaScript as much as you like to eat " + dessert + ".");
	
		in.close();
	} // end of main

} // end of class
