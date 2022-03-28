/*Program/Project: Lab3a
 * Name: Sehee Jang
 * Date: Sept 28, 2020
 * Instructor: Sister Kristi Hays
 * Description: Select Correct Shirt Sizes
 */
package Week03;
import java.util.Scanner;

/**
 * @author sehee
 *
 */
public class lab3a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Display the purpose of the program
		System.out.println("In this program will determine the correct shirt size for a man!");
		
		//Ask the user for the chest measurement
		System.out.println("Please enter the customer's chest measurement in inches:");
		int chestSize = in.nextInt();
		
		//Determine the shirt size needed
		if (chestSize < 38) {
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size S.");
		} else if(chestSize >= 38 && chestSize < 40) {
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size M.");
		
		} else if(chestSize >= 40 && chestSize < 43) {
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size L.");
		
		} else if(chestSize >= 43 && chestSize < 46) {
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size XL.");
		
		} else {
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to oder a size XXL.");
		
		in.close();
		}//end of if statement (chestSize < 38)
		
	}//end of main()

}//end of class Lab3a
