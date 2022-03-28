/*
 * Program/Project: Lab10a
 * Name: Sehee Jang
 * Date: Nov 16, 2020
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
public class lab10a {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("Student Assignment Scores.csv");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static void writeFile() throws IOException {
		Scanner scan = new Scanner(System.in);
		File CSV = new File("Student Assignment Scores.csv");
		FileWriter file = new FileWriter("Student Assignment Scores.csv");
		CSV.createNewFile();

		String[] firstname = new String[10];
		String[] lastname = new String[10];
		String[] coursename = new String[10];
		String[] grade = new String[10];
		int id;

		file.write("ID,FirstName,LastName,Course,Grade\n");

		for (int i = 0; i < 10; i++) {
			id = i + 1;
			System.out.println("\nEnter info and grades for the student " + id);

			System.out.println("First Name:");
			firstname[i] = scan.nextLine();

			System.out.println("Last Name:");
			lastname[i] = scan.nextLine();

			System.out.println("Course Name:");
			coursename[i] = scan.nextLine();

			System.out.println("Grade:");
			grade[i] = scan.nextLine();

			file.write(id + "," + firstname[i] + "," + lastname[i] + "," + coursename[i] + "," + grade[i] + "\n");

			System.out.println("\n\nID    FirstName    LastName    Course    Grade");

			for (int j = 0; j < id; j++) {
				System.out.println(
						i + 1 + "\t" + firstname[j] + "\t\t" + lastname[j] + "\t" + coursename[j] + "\t" + grade[j]);
			}
		}

		file.close();

		String path = CSV.getAbsolutePath();
		System.out.println("Results can found in file " + path);
	}
}
