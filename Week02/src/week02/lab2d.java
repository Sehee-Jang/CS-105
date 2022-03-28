/*Program/Project: Lab2d
 * Name: Sehee Jang
 * Date: September 25, 2020
 * Instructor: Sister Kristi Hays
 *  Description: Monthly Interest
 */
package week02;
import java.util.Scanner;

/**
 * @author sehee
 *
 */
public class lab2d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		
		
		//Display the purpose of the program
		System.out.println("This program will ask for the user for a monthly insterest rate.");
		
		
		//Ask the user for the amount to be deposited each month
		System.out.println("Please enter the amount to be deposited.");
		float deposit = in.nextFloat();
		
		
		//Ask the user for the annual interest rate percent
		System.out.println("Please enter the annual interest rate percent.");
		float annualInterestRate = in.nextFloat();
		
		
		//Calculate monthly interest
		float monthlyInterestRate = annualInterestRate / 100 / 12;
		
		//Calculate month 1
		float month1 = deposit * (1 + monthlyInterestRate);
		
		//Calculate month 2
		float month2 = (month1 + deposit) * (1 + monthlyInterestRate);
		
		//Calculate month 3
		float month3 = (month2 + deposit) * (1 + monthlyInterestRate);
		
		//Calculate month 4
		float month4 = (month3 + deposit) * (1 + monthlyInterestRate);
		
		//Calculate month 5
		float month5 = (month4 + deposit) * (1 + monthlyInterestRate);
		
		//Calculate month 6
		float month6 = (month5 + deposit) * (1 + monthlyInterestRate);
		
		//Display the results to the concole
		System.out.println("/n The ending balance after 6 month is: $" + month6);
		
		in.close(); // close Scanner
	}	//end of main()

}	// end of class Lab2d
