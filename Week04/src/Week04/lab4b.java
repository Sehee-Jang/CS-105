/*
 * Program/Project: Lab4b
 * Name: Sehee Jang
 * Date: Oct 07, 2020
 * Instructor: Sister Kristi Hays
 * Description: Input validation
 */
package Week04;
import java.util.Scanner;
/**
 * @author sehee
 *
 */
public class lab4b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = ""; // empty를 대입해라 (insert)
		
		int num1 = 0; // 0을 대입해라
		int num2 = 0;
		int num3 = 0;
		
		boolean valid = false; // (true)
		
		// int num1 = 0, num2 = 0, num3 = 0;
		
		do {
			System.out.println("Enter a number:");
			input = in.nextLine();
			
			try {
				num1 = Integer.parseInt(input); // Integer라는 클래스에 parseInt라는 함수가 있다. 그 함수는 input이라는 String을 받는다. 그리고 input이라는 값을 해석을 해서 input값으로 바꾸어 반환한다. '=' 대입해라
				valid = true;
			} catch(Exception e) { // Try했는데 error가 나면 잡아라 e(=error)
				System.out.println("Error: Please enter a whole number. \n");
			} // end of try/catch
		} while (!valid);
			
		/*do를 사용하면 앞에 값을 계산 후 while안에 있는 값을 체크하고,
		while을 먼저 사용하면 값을 먼저 사용하고 do를 실행한다.*/
		
		num2 = num1 + 1000;
		num3 = num1 * 2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		// valid == false
		
		// ! - not
		// valid -> true
		// !valid -> not valid -> not true == false
		
		
		
	} // end of main

} // end of class
