import java.util.Scanner;

/**
 * This is an application created for Java Bootcamp Lab 9
 * 
 * This application will:
 * 	Prompt the user to enter a radius
 * 	Display an error if the user enters invalid data
 * 	Calculate the area and circumference of the circle and round to the nearest 2 decimal places
 * 	Prompt the user to continue
 * 	Display a "goodbye" message that also indicates the number of circles the user build when the user chooses not to continue
 * 
 * Build specifications:
 * 	Create a class named Circle to store the data about this circle. This class should contain these constructors and methods:
 * 		public Circle(double radius)
 * 		public double getCircumference()
 * 		public String getFormattedCircumference()
 * 		public double getArea()
 * 		public String getFormattedCircumference()
 * 		private String formatNumber(double x)
 * 		public static int getObjectCount()
 * 	Use the PI constant of the java.lang.Math class
 * 	Create a class named CircleApp that gets the user input, creates a Circle object, and displays the circumference and area
 * 
 * Extended Challenge:
 * 	Create a class named Validator like the one shown in chapter 7 and use its static methods to validate data in this application
 * 		
 */

/**
 * @author Jeseekia
 *
 */
public class CircleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userContinue;
		
		
		do {
			System.out.println("Enter a radius: ");
			int userInput = Validator.getValidInteger(input);
			Circle myCircle = new Circle(userInput);
			myCircle.getArea();
			myCircle.getCircumference();
			System.out.println("Formatted area: " + myCircle.getFormattedArea());
			System.out.println("Formatted circumference: " + myCircle.getFormattedCircumference());
			
			System.out.println("Would you like to continue?(y/n)");
			userContinue = input.nextLine();
} while (userContinue.equalsIgnoreCase("y") == true);
		
		boolean isValidChoice = userContinue.matches("^[ynYN]$");
			while (!isValidChoice) {
				System.out.println("That is not a valid option");
				System.out.println("Continue?");
				userContinue = input.nextLine();
			isValidChoice = userContinue.matches("^[ynYN]$");
			}
		
		if (userContinue.equalsIgnoreCase("n") == true) {
			System.out.println("The program will exit now.");
			input.close();
		}
	}

}
