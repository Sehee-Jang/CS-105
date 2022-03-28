/**
 * 
 */
package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sehee Jang
 *
 */
public class lab13a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File grades = new File("Student Assignment Scores.csv");
		Scanner scan = null;
		
		try {
			scan = new Scanner(grades);
		} catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("An error has occurred");
		}
		
		scan.nextLine();
		
		/*Warning Letter access*/
		
		File letter = new File("Warning Letter to Student -.txt");
		Scanner scan2 = null;
		
		try {
			scan2 = new Scanner(letter);
		} catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("An error has occurred");
		}
		
		scan2.useDelimiter("\\Z");
		String letterToStudent = scan2.next();
		
		/*Writing Letter*/
		
		FileWriter studentL = null;
		
		while (scan.hasNextLine()) {
			String[] line = scan.nextLine().split(",");
			
			// if student contains at least one missing assignment, then wrote a letter to him/her.
			if (Arrays.asList(line).contains(line[1].equals("0") || line[2].equals("0") || line[3].equals("0") || line[4].equals("0") || line[5].equals("0") || line[6].equals("0"))) {
				String title = "Warning Letter to Student - " + line[0] + ".txt";
				File studnetLetter = new File(title);
				
				try {
					studentL = new FileWriter(studentLetter);
					//write a letter to a student
				} catch(FileNotFoundException e){
					System.out.println("An error has occurred");
				}
				
				String letterBody = "Dear" + line[0] + ",\n" + letterToStudent + "\n\n";
				
				studentL.write(letterBody);
				
				for (int i = 1; i <= 6; i++) {
					// scores aren't numbers in format, but they are stirings
					// therefore, we use string methods instead of numeric methods
					// String.equals(string to compare) instead of ==
					if (line[i].equals("0")) {
						letterBody = "Assignment " + i + "\n";
						
						studentL.write(letterBody);
					}
				}
			
				studentL.close();
			}
		}
		
		scan.close();
		scan2.close();
		
		System.out.println("A2222");
	} // end of main

} // end of class
