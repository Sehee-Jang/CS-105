/**
 * 
 */
package Week12;

import java.util.Scanner;

/**
 * @author Sehee Jang
 *
 */
public class lab12b {

	public static void main(String[] args) {
		Scanner sIn = new Scanner(System.in); //numbers
		Scanner enterkey = new Scanner(System.in); 
		int num = 3;
		String Apostle = "";
		boolean done = false;
		
		do {
			System.out.println("This program will show the name of an apostle based on the order they were called with President Nelson as #1\n"
					+ "Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): ");
			num = sIn.nextInt();
			
			switch (num) {
			case 1:
				Apostle = "Russell M Nelson";
				break;
			case 2:
				Apostle = "ABC";
				break;
			case 3:
				Apostle = "M Russell Ballard";
				break;
			default:
				Apostle = "That's not a valid choice. Try again.";
			} // end of switch
			
			System.out.println(Apostle);
			
		} while(!done); {
			if(Apostle.equals("")) {
				System.exit(0);
			} else {
				done = true;
			}
		};
		
		sIn.close();
		enterkey.close();
	} // end of main

} // end of class
