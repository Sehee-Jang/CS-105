/*Program/Project: lab2b
 * Name: Sehee Jang
 * Date: September 21, 2020
 * Instructor: Sister Kristi Hays
 *  Description: Hello World... Revised
 */
package week02;

/**
 * @author sehee
 *
 */
import java.util.Scanner;

public class lab2b {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		
		//Ask the user's name
		System.out.println("Please enter your name: ");
		String name = in.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.println();
		
		//Ask the user's favorite dessert
		System.out.println("What's your favorite dessert?");
		String dessert = in.nextLine();
		System.out.println("I hope you like coding JavaScript as much as you like to eat " + dessert + ".");
		System.out.println();
		
		//Ask the user's favorite color
		System.out.println("What's your favorite color?");
		String color = in.nextLine();
		System.out.println("Wow! I like " + color + ",too!");
		System.out.println();
		
		//Ask the user's birthday
		System.out.println("When is your birthday?");
		String birthday = in.nextLine();
		System.out.println("I'll remember your birthday, " + birthday +  ", then say happy birthday!");
		System.out.println();
		
		//Ask the user's favorite pet
		System.out.println("What's your favorite kind of pet?");
		String pet = in.nextLine();
		System.out.println("Oh, do you like " + pet + "? " + "I'm a dog person. :)");
		System.out.println();
		
		//Ask where the user lives
		System.out.println("Where do you live?");
		String region = in.nextLine();
		System.out.println("I used to visit " + region + " a lot when I was younger. I'm happy to meet you:)");
		System.out.println();

		//Ask the user's favorite food
		System.out.println(name + ", what's your favorite food?");
		String food = in.nextLine();
		System.out.println(food + "! That's my favorite, too!");
		System.out.println();
		
	} //end of main

} // end of class lab2b
