/**
 * 
 */
package Week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sehee Jang
 *
 */
public class lab12a {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File pwd = new File("Pwd.txt");

		Scanner scan = null;

		// System.in
		try {
			scan = new Scanner(pwd);
			System.out.println("Beginning password analysis....\r\n" + "Opening file " + pwd.getName() + ".");
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}

		File valid = new File("validPwd.txt");
		File invalid = new File("invalidPwd.txt");

		FileWriter writerV = null;
		FileWriter writerI = null;

		try {
			writerV = new FileWriter(valid);
			writerI = new FileWriter(invalid);
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("An error has occurred.");
		}

		while (scan.hasNextLine()) {
			String line = scan.nextLine() + "\n";
			if (hasUpper(line) && hasLower(line) && hasNumber(line) && hasSpecial(line)) {
				// write in ValidPwd.txt

				try {
					writerV.write(line);
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("An error has occurred. Unable to write in the file.");
				}
			} else {
				// write in inValidPwd.txt

				try {
					writerI.write(line);
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("An error has occurred. Unable to write in the file.");
				}
			}
		}

		System.out.println("Analysis complete. Closing files.\n" + "Results can be found in files '" + valid.getName()
				+ "' and " + invalid.getName() + "'" + "in the" + pwd.getAbsolutePath() + ".");
		scan.close();
		writerV.close();
		writerI.close();
	} // end of main

	public static boolean hasUpper(String text) {
		char[] pass = text.toCharArray();
		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(pass[i])) {
				count++;
			}
		}

		if (count > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean hasLower(String text) {
		char[] pass = text.toCharArray();
		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (!Character.isUpperCase(pass[i])) {
				count++;
			}
		}

		if (count > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean hasNumber(String text) {
		char[] pass = text.toCharArray();
		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(pass[i])) {
				count++;
			}
		}

		if (count > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean hasSpecial(String text) {
		char[] list = { '@', '#', '%', '-', '&', '*' };

		char[] textArray = text.toCharArray();

		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < list.length; j++)
				if (textArray[i] == list[j]) {
					count++;
				}
		}

		if (count > 0)
			return true;
		else
			return false;
	}
} // end of class
