/*
 * Program/Project: Lab3c
 * Name: Sehee Jang
 * Date: Sept 30, 2020
 * Instructor: Sister Kristi Hays
 * Description: Sunday Class
 */
package Week03;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab3c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Use Scanner for getting Input from user
		Scanner iIn = new Scanner(System.in); // Input Scanner for numbers	
		Scanner sIn = new Scanner(System.in); // Input Scanner for strings
		
		//Display the purpose the program
		System.out.println("This program will ask a member's age and gender.");
		
		//Ask the user for the member's age
		System.out.println("Please enter the member's age: ");
		int age = iIn.nextInt();
		
		//Determine the correct class assignment
		if (age >= 18) { //Priesthood or Relief Society
			//Determine the class based on gender
			System.out.println("Please enter the member's gender: ");
			String gender = sIn.nextLine();
			
			if (gender.equalsIgnoreCase("M")) {
				System.out.println("The member should attend Priesthood.");
				
			} else if (gender.equalsIgnoreCase("F")) {
				System.out.println("The member should attend Relief Society.");
			
			} else {
				System.out.println("Invail response. Next time, please enter M or F for the gender.");
			}//close else statement
			
		} else if (age >= 12) { //Young men or Young women
			//Determine the class based on gender
			System.out.println("Please enter the member's gender: ");
			String gender = sIn.nextLine();
			
			if (gender.equalsIgnoreCase("M")) {
				System.out.println("The member should attend Young Men.");
					
			} else if(gender.equalsIgnoreCase("F")) {
				System.out.println("The member should attend Young Women.");
			
			} else {
				System.out.println("Invail response. Next time, please enter M or F for the gender.");
			} //close else statement
			
		} if (age >= 3) { //Primary
			//Determine the class based on age
			System.out.println("The member should attend Primary.");
			
		} else if (age >= 1) { //Nursery
			System.out.println("The member should attend Nursery.");
			
		} else { //Babe In Arms
			System.out.println("The member should attend Arms.");
		}
	
		iIn.close(); // close number scanner
		sIn.close(); // close string scanner
		
	}// end of main()

}// end of class Lab3c
