/*
 * Program/Project: Lab10c
 * Name: Sehee Jang
 * Date: Nov 19, 2020
 * Instructor: Sister Kristi Hays
 * Description: Displays File Contents 
*/
package Week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author sehee
 *
 */
public class lab10i {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("Student Assignment Scores.csv");
		Scanner scan = null;

		String header = "";

		try {
			scan = new Scanner(f);
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("File not found. An error has occurred.");
		}

		// Read the first line of the file before you start your while loop.
		header = scan.nextLine();

		header = "Student             Assignment with 0";

		System.out.println(header);

		System.out.println("-----------------------------------");

		while (scan.hasNext()) {
			String line = scan.nextLine();

			printData(line);
		}
		scan.close();
	}

	/*
	 * printData - print the line of my .csv file
	 * 
	 * @param text - line of the file sent from the main program
	 * 
	 * @return void does not require a return statement
	 * 
	 */
	public static void printData(String text) {
		// TODO Auto-generated method stub
		String[] scores = text.split(",");

		// count the zero scores of students
		int countZeros = 0;

		// i from 1 to 6 are the scores
		// i as 0 is the Student Name
		for (int i = 1; i <= scores.length; i++) {
			// scores aren't numbers in formal, but they are strings
			// therefore, we use string methods instead of numeric methods
			// String.equlas(string to compare) instea of ==
			if (scores[1].equals("0")) {
				countZeros++;
			}
		}

		// We print out only Students who contain zeros
		// if they do not have zero as scores at all we keep them out
		if (countZeros > 0) {
			System.out.printf("%-20s", scores[0]);
			System.out.printf("%20s\n", countZeros);
		}

	}

}
