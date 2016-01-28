/**
 * This program is created for the Java Bootcamp Lab 4
 * The application will
 * 	Prompt the user to enter an integer from 1 to 10
 * 	Display the factorial of the number entered by the user
 * 	Prompt the user to continue
 * 
 * Build specifications:
 * 	Use a for loop to calculate the factorial
 * 	Assume that the user will enter valid data
 * 	Use the long type to store the factorial
 * 	Continue only if the user agrees to
 * 
 * Bonus specifications:
 * 	Find the integer for the highest factorial that can be accurately calculated by the application and modify the prompt to reflect this
 * 	Use recursion to implement the factorial
 */

/**
 * @author Jeseekia
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		returnFactorial(5);
		returnFactorial(4);
		returnFactorial(3);
		returnFactorial(2);
		returnFactorial(1);
		
	}
	
	public static float returnFactorial(int n) {
		int result = n;
		for(int i=n; i>1; i--) {
			result*=(n-1);
			n--;
		}
		System.out.println(result);
		return result;
	}
	

}
