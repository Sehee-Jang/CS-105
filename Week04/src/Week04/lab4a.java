/*Program/Project: Lab4a
 * Name: Sehee Jang
 * Date: Oct 05, 2020
 * Instructor: Sister Kristi Hays
 * Description: Factorial Fun
 */
package Week04;
import java.util.Scanner; //import the scanner
/**
 * @author sehee
 *
 */
public class lab4a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner iIn = new Scanner(System.in); //numbers
		Integer num1 = 0;
		Integer num2 = 0;
		Integer num3 = 0;
		
		boolean valid = false;
		
		System.out.println("Please enter a whole number: ");
		do { //Validate input to be an integer
			if (iIn.hasNextInt()) {
				num1 = iIn.nextInt();
				valid = true;
			}	else {
				valid = false;
				System.out.println("Error: Please enter whole number.");
				iIn.nextLine();
			}
		} while (!(valid));
		
		num2 = (num1 + 1000); //Calculations to print
		num3 = (num1 * 2);
		
		System.out.println("num1 = " + num1 + ".\nnum2 = " + num2 + " .\nnum3 = " + num3 + ".");
		iIn.close();
		
	} // end of main
	
} //end of class lab4a
