/*
 * Program/Project: Lab11b
 * Name: Sehee Jang
 * Date: Nov 24, 2020
 * Instructor: Sister Kristi Hays
 * Description:  
*/
package Week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class lab11b {
	/**
	 * main() method displays a menu to the user and asks them to select a command.
	 * The method will continue to display the menu to the user until they wish to
	 * quit by selecting 'Exit' from the menu. The method also creates a new, empty
	 * shoppingList of type ArrayList<String> Based on the user input, the
	 * appropriate method will be called to perform actions on the shoppingList.
	 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// Initialize variables
		Scanner sIn = new Scanner(System.in); // Input Scanner for String
		ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
		String choice; // Holds user input of type String
		boolean done = false; // Keeps program running until user wants to quit

		// Keep running the program until the user quits
		do {
			// Print out the menu to the console
			System.out.println();
			System.out.println("1. Add Items");
			System.out.println("2. Delete Items");
			System.out.println("3. Show Items");
			System.out.println("4. Sort Items");
			System.out.println("5. Save List");
			System.out.println("6. Open list");
			System.out.println("7. Exit");
			System.out.print("Please enter a command: ");
			choice = sIn.nextLine();

			// Call the appropriate method for the choice selected.
			switch (choice) {
			case "1": // Add items to the Shopping List
				System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
				break;
			case "2": // Delete items from the Shopping List
				System.out
						.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
				break;
			case "3": // Show the items in the Shopping List
				showItems(shoppingList);
				break;
			case "4": // Sort the items in the Shopping List
				sortItems(shoppingList);
				break;
			case "5":
				String FILENAME = "Shopping List.txt";
				saveList(sIn, shoppingList, FILENAME);
				break;
			case "6":
				FILENAME = "Shopping List.txt";
				shoppingList = openList(sIn, shoppingList, FILENAME);
				break;
			case "7": // Exit the program
				System.out.println("\nGoodbye.");
				done = true;
				break;
				
			default: // Handles all input that is not between 1-5
				System.out.println("Invalid response.  Please enter a choice from the menu (1-5).");
			} // End of switch (choice)
		} while (!done); // Keep running the program until the user quits
	}// end of main()

	public static ArrayList<String> openList(Scanner sIn, ArrayList<String> shoppingList, String file) {
		boolean valideYN = false;
		String userInput;
		
		do {
			System.out.println("Are you sure you wish to overwrite your current shopping list with the '" + file + "' file? (Y/M): ");
			userInput = sIn.next();
			
			if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("N")) {
				valideYN = true;
			} else {
				System.out.println("Invalid response. Please answer with a 'Y' or 'N'.");
			}
		} while(valideYN == false);
		
		File shopList = new File(file);
		
		// FileReader reader = null;
		Scanner scan = null;
		
		try {
			scan = new Scanner(shopList);
			// reader = new FileReader(shopList);
		} catch (FileNotFoundException e){ 
			System.out.println("File Error: File '" + file + "' not found! Please save the list before trying to open it.");
			return shoppingList;
		}
		
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			shoppingList.add(line);
		}
		
		scan.close();
		
		System.out.println("Shopping List overwritten from file: " + file);
		
		return shoppingList;
	} 
	private static void saveList(Scanner sIn, ArrayList<String> shoppingList, String file) throws IOException {
		boolean valideYN = false;
		String userInput;

		do {
			System.out
					.println("Are you sure you wish to overwrite the " + file + " file with your current list? (Y/N)");
			userInput = sIn.next();

			if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("N")) {
				valideYN = true;
			} else {
				System.out.println("Error. Please answer Y for yes or N for No.");
			}

		} while (valideYN == false);

		if (userInput.equalsIgnoreCase("Y")) {
			// save and write in the file
			File shopList = new File(file);
			String line = "";

			FileWriter writer = null;

			try {
				writer = new FileWriter(shopList);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("An error has occurred.");
			}

			for (int i = 0; i < shoppingList.size(); i++) {
				line = shoppingList.get(i) + "\n";
				
				try {
					writer.write(line);
					System.out.println("Shopping List saved to file: " + file);
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("An error has occurred. Unable to write in the file.");
				}
			}

			writer.flush();
			writer.close();
		} else {
			// display not saved message
			System.out.println("Shopping List not saved");
		}
	}

	/**
	 * addItems() method asks the user to enter an item to be stored in the
	 * shoppingList and then adds the item to the shoppingList ArrayList. The user
	 * may enter as many items as they want, hitting ENTER to stop entering items
	 * and return to main(). Each time the user enters an item into the list, a
	 * message will be displayed showing the item entered. Returns the number of
	 * items added to the shoppingList
	 */
	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
		String input = "";
		do {
			System.out.println("Add an item to the list (or just hit 'ENTER' when done): ");

			input = sIn.nextLine();
			if (!input.equals("")) {
				shoppingList.add(input);
				System.out.println(input + " has been added to the Shopping List.");
			}

		} while (!input.equals(""));

		return shoppingList.size();
	}// end of method addItems(ArrayList<String>)

	/**
	 * deleteItems() method asks the user to enter an item to be deleted from the
	 * shoppingList and then deletes the item from the shoppingList ArrayList. The
	 * user may delete as many items as they want, hitting ENTER to stop deleting
	 * items and return to main(). Each time the user deletes an item from the list,
	 * a message will be displayed showing the item deleted. If the user tries to
	 * delete an item not in the list, a message will be displayed indicating the
	 * error and showItems() will be called. Returns the number of items deleted
	 * from the shoppingList
	 */
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
		String input = "";
		int deleted = 0;

		do {
			System.out.println("Which Item do you want to delete from the list (or just hit 'ENTER' when done): ");
			input = sIn.nextLine();

			if (shoppingList.contains(input)) {
				shoppingList.remove(input);
				System.out.println(input + " has been added to the Shopping List.");
				deleted++;
			} else {
				System.out.println("\nError: Element not present in the shopping list.");
				showItems(shoppingList);
			}

		} while (!input.equals(""));

		return deleted;

	}// end of method deleteItems(ArrayList<String>)

	/**
	 * showItems() method simply displays the contents of the shoppingList ArrayList
	 * in it's simplest form: [item-1, item-2, item-n]
	 */
	public static void showItems(ArrayList<String> shoppingList) {
		int i = 0;
		System.out.print("[");
		while (i < shoppingList.size()) {
			System.out.print(shoppingList.get(i));
			if (!(i == shoppingList.size() - 1)) {
				System.out.print(",");
			}
			i++;
		}
		System.out.print("]");
	}// end of method showItems(ArrayList<String>)

	/**
	 * sortItems() method sorts the items in the shoppingList ArrayList, then calls
	 * showItems() to display the sorted list.
	 */
	public static void sortItems(ArrayList<String> shoppingList) {
		Collections.sort(shoppingList);

		showItems(shoppingList);
	}// end of method sortItems(ArrayList<String>)

}// end of class Lab9aStartCode
