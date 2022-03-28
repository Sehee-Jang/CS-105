/*
 * Program/Project: Lab4i
 * Name: Sehee Jang
 * Date: Oct 07, 2020
 * Instructor: Sister Kristi Hays
 * Description: Guessing Game
 */
package Week04;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author Sehee
 *
 */
public class lab4i {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Use Scanner for getting input from user
		Scanner nln = new Scanner(System.in); // Scanner for integer
		Scanner sln = new Scanner(System.in); // Scanner for string
		
		// Initialize variables with appropriate values
		int userGuess = 0;
		String input ="";
		boolean valid = false;
		boolean playAgain = false;
		
		// Primary Do While
		do {
			int guessCount = 0;
			System.out.print("This program is a guessing game.\nThe computer will generate a random integer between 1 and 100." + "The user will try to guess the number.\nLet's get started!\n\n");
			
			System.out.print("I'm thinking of a number between 1 and 100.\n");
			
			//Define the range
			int max = 100;
			int min = 1;
			int range = max - min + 1;
			
			//Generate a random number between min and max.
			int randNum = (int)(Math.random() * range) + min;
			System.out.print("The number was" + randNum + ".SHHHH! It is a secret!\n");
			
			//Game do while loop
			do {
				//Numeric input validation do-while loop
				do {
					System.out.print("What is your guess?");
					
					// if block to check if initial input is valid
					if(nln.hasNextInt()) { //만약에 nln안 다음에 오는 값이 INT면 아래를 실행해라 그렇지 않으면 else로 가라
						userGuess = nln.nextInt();
						valid = true;
					} else {
						System.out.print("Error. Plese enter a while number.\n\n");
						valid = false;
						nln.hasNextLine();
						guessCount++;
					}
				} while (!valid); //if false, run the loop
				
				//if clock to decide what hint to give
				if (userGuess > randNum) {
					guessCount++;
					System.out.print("Your guess is too high. Try again.\n\n");	
				} else if (userGuess < randNum) {
					guessCount++;
					System.out.print("Your guess is too low. Try again.\n\n");
				} else {
					guessCount++;
					System.out.print("Correct! You guessed it in " + guessCount + "tries!!\n\n");
					//continue
				}
			} while(userGuess != randNum); // if false, run the loop
			
			//Non-Numeric Input Validation do-While loop
			do {
				valid = false;
				System.out.print("Would you like to play again?");
				input= sln.next();
				
				// if block to check if initial input is valid
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				} 
				//if block to decide to start game over or say good bye
				if(input.equalsIgnoreCase("Y")) {
					playAgain = true;
					System.out.print("\n\n");
					break;
				} else if (input.equalsIgnoreCase("N")) {
					System.out.print("Thanks for playing!");
					playAgain = false;
					break;
				} else {
					System.out.print("Error: Please answer with Y or N.\n\n");
					valid = false;
					playAgain = true;
				}
			} while (playAgain);
			
			if (!playAgain) {
				nln.close(); // integer scanner
				sln.close(); // close scanner	
				break;
			}
						
		} while (valid);
	} // end of main
	
} // end of class
