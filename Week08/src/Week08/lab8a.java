/*
 * Program/Project: Lab8a
 * Name: Sehee Jang
 * Date: Nov 2, 2020
 * Instructor: Sister Kristi Hays
 * Description: Passing an array list to sumValues()
 */
package Week08;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author sehee
 *
 */
public class lab8a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner nIn = new Scanner(System.in);
		
		String ans = "";
		int num = 0;
		
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {
			boolean loopC= true;
			numbers.clear();
			
			System.out.println("This program will ask the user to enter a series of numbers.\n"
					+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\n"
					+ "The program will then display the array of numbers and the sum total of those numbers.\n");
			
			while (loopC) {
				System.out.println("Please enter a number or just hit enter to finish:");
				ans = nIn.nextLine();
				
				if (ans.equals("")) {
					loopC = false;
				} else {
					try {
						num = Integer.parseInt(ans);
						numbers.add(num);
					} catch (Exception e) {
						System.out.println("Invalid response. Please enter a valid whole number.\n");		
					}
				}
			}
			
			System.out.println("Array Index - Item");
			
			for(int i = 0; i < numbers.size(); i++) {
				System.out.println(i + "           " + numbers.get(i));
			}
			
			System.out.println("There are " + numbers.size() + " items in the ArrayList.");
			System.out.println("The sum total of numbers in the ArrayList is " + sumValues(numbers));
		
			playAgain = getValidYN("Would you like to play again? (Y/N): ", "Error. Please, enter Y for Yes or N for No.");
			System.out.println();
		}
		
		System.out.println("Thank you for playing!");
	} // end of main

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
	
	public static int sumValues(ArrayList<Integer> numbers) {
		int totalValue = 0;
		for (int i = 0; i < numbers.size(); i++) {
			totalValue = totalValue + numbers.get(i);
		}
		
		return totalValue;
	} // end
	
} // end of class
