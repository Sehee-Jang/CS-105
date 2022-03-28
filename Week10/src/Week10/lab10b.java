/*
 * Program/Project: Lab10b
 * Name: Sehee Jang
 * Date: Nov 19, 2020
 * Instructor: Sister Kristi Hays
 * Description: Displays File Contents 
*/
package Week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author sehee
 *
 */
public class lab10b {

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
			System.out.println("File not found.");
		}
		
		// Read the first line of the file before you start your while loop.
		header = scan.nextLine();

		// System.out.println(header);
		printData(header);
		System.out.println("-----------------------------------");

		while (scan.hasNextLine()) {
			String line = scan.nextLine();

			printData(line);
		}
		scan.close();
	}

	public static void printData(String line) {
		// TODO Auto-generated method stub
		String[] scores = line.split(",");
		/*
		 * How does string.split("") wokr?
		 * 
		 * Example line = "Kate Mulgrew, 92, 98, 91,96,97,99"
		 * 
		 * line.split"." split the string into a String array of elements in betweeen
		 * "," -> String[] array = { "Kate Mulgrew"}, "92", "98", "91", "96", "97",
		 * "99"}
		 * 
		 * 
		 */

		// printf or print formatted is material from the reading

		System.out.printf("%-20s", scores[0]);

		System.out.printf("%7s", scores[1]);
		System.out.printf("%7s", scores[2]);
		System.out.printf("%7s", scores[3]);
		System.out.printf("%7s", scores[4]);
		System.out.printf("%7s", scores[5]);
		System.out.printf("%7s\n", scores[6]);

	}

}
