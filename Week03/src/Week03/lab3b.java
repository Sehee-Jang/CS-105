/*Program/Project: Lab3b
 * Name: Sehee Jang
 * Date: Sept 28, 2020
 * Instructor: Sister Kristi Hays
 * Description: Calculating BMI
 */
package Week03;
import java.util.Scanner;

/**
 * @author sehee
 *
 */
public class lab3b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Display the purpose of the program
		System.out.println("In this program, we will calculate a person's BMI.");

		//Ask the user for their height
		System.out.println("Please enter your height in inches:");
		
		int iHeight = in.nextInt();
		
		//Ask the user for their weight
		System.out.println("Please enter your weight in pounds:");
		int lbsWeight = in.nextInt();
		
		//Convert height and weight to metric
		double mheight = iHeight * .0254;
		double mWeight = lbsWeight * .45359237;
		
		//Calculate BMI
		double bmi = mWeight/(mheight*mheight);
		
		//Print our the BMI Classification
		if (bmi < 18.5) {
			System.out.println("The person's BMI is: " + bmi + ". The person has a BMI clasification of: Underweight.");
		
		} else if (bmi >= 18.5 && bmi < 25){
			System.out.println("The persons's BMI is: " + bmi + ". The person has a BMI classification of: Normal");
		
		} else if (bmi >= 25 && bmi < 30){
			System.out.println("The persons's BMI is: " + bmi + ". The person has a BMI classification of: Overweight");
		
		} else {
			System.out.println("The persons's BMI is: " + bmi + ". The person has a BMI classification of: Obese");
		}//end of if(bmi > 18.5)
		
		in.close();
	}//end of main()

}//end of class Lab3b
