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
		String input = ""; // empty�� �����ض� (insert)
		
		int num1 = 0; // 0�� �����ض�
		int num2 = 0;
		int num3 = 0;
		
		boolean valid = false; // (true)
		
		// int num1 = 0, num2 = 0, num3 = 0;
		
		do {
			System.out.println("Enter a number:");
			input = in.nextLine();
			
			try {
				num1 = Integer.parseInt(input); // Integer��� Ŭ������ parseInt��� �Լ��� �ִ�. �� �Լ��� input�̶�� String�� �޴´�. �׸��� input�̶�� ���� �ؼ��� �ؼ� input������ �ٲپ� ��ȯ�Ѵ�. '=' �����ض�
				valid = true;
			} catch(Exception e) { // Try�ߴµ� error�� ���� ��ƶ� e(=error)
				System.out.println("Error: Please enter a whole number. \n");
			} // end of try/catch
		} while (!valid);
			
		/*do�� ����ϸ� �տ� ���� ��� �� while�ȿ� �ִ� ���� üũ�ϰ�,
		while�� ���� ����ϸ� ���� ���� ����ϰ� do�� �����Ѵ�.*/
		
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
