/*
 * Program/Project: Lab7a
 * Name: Sehee Jang
 * Date: Oct 26, 2020
 * Instructor: Sister Kristi Hays
 * Description: checkEligibility()
 */
package week07;

import java.util.Scanner;
import java.time.LocalDate;

/**
 * @author sehee
 *
 */
public class lab7a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner checker = new Scanner(System.in);
		String name;
		String age;
		boolean ageTrue = false;
		boolean gameRun = false;
		String ansW;

		do { // main loop
			System.out.println("Please enter the name of a potential student.");
			name = checker.nextLine();

			do { // Year try catch loop
				System.out.println("Please enter the year the potential student was born.");
				age = checker.nextLine();

				try {
					Integer.parseInt(age);
					ageTrue = true;
				} catch (NumberFormatException e) {
					System.out.println("Invalid response. Please enter a whole number for the birth year.");
					ageTrue = false;
				}
			} while (!ageTrue);

			checkEligibility(name, Integer.parseInt(age)); // Main output

			do { // Replay loop
				System.out.println("Do you want to play again?");
				ansW = checker.nextLine();
				gameRun = ansW.equalsIgnoreCase("Y") || ansW.equalsIgnoreCase("N");
				if (!gameRun) {
					System.out.println("Error! Please answer Y or N.");
				}
			} while (!(ansW.equalsIgnoreCase("Y") || ansW.equalsIgnoreCase("N")));
		} while (!ansW.equalsIgnoreCase("N")); // end main while

	} // end of main

	public static void checkEligibility(String name, Integer age) { // get eligibility information

		if (calculateAge(age) <= 4) {
			System.out.println(
					name + "is" + calculateAge(age) + "years old. " + name + " is not eligible to attend school.");

		} else if (calculateAge(age) <= 11) {
			System.out
					.println(name + "is" + calculateAge(age) + "years old. " + name + " may attend Elementary School.");

		} else if (calculateAge(age) <= 14) {
			System.out.println(
					name + "is" + calculateAge(age) + "years old. " + name + " may attend Junior High School.");

		} else if (calculateAge(age) <= 17) {
			System.out.println(name + "is" + calculateAge(age) + "years old. " + name + " may attend High School.");

		} else if (calculateAge(age) >= 18) {
			System.out.println(name + "is" + calculateAge(age) + "years old. " + name + " may attend College.");
		}

	}

	public static Integer calculateAge(Integer x) { // Calculate age based on birth year
		LocalDate rightNow = LocalDate.now();
		int thisYear = rightNow.getYear();
		int age = thisYear - x;
		return age;
	}
} // end of class
