import java.math.BigDecimal;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author Jeseekia
 *
 */
public class Validator {
	
	public static int getValidInteger(Scanner scan1) {
		// Loop while the input is not an integer!
		while (!scan1.hasNextInt()) {
			System.out.println("Please enter a valid integer!");
			scan1.nextLine(); // consume the new line
		}
		int number = scan1.nextInt();
		scan1.nextLine();
		return number;
	}
	
	
	public static int getValidIntegerInRange(int min, int max, Scanner scan1) {
		int number = getValidInteger(scan1);// get a valid number
		while (number > max || number < min) {
			System.out.println("Please enter a number between " + min + " and " + max);
			number = getValidInteger(scan1);// get a valid number
		}
		return number;
	}
}
