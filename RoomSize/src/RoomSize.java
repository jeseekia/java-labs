import java.util.Scanner;

/**
 * This application is Lab 1 for January 2016 Java Bootcamp
 * The application has the following features:
 * 	Prompts the user to enter values of length and width of the classroom
 * 	Displays the area and perimeter of that classroom
 * 	Prompts the user to continue - keep measuring rooms
 * 	Only continues if the user agrees
 * 	Calculates the volume of the room
 * 	Ignores the case when asking whether the user wants to continue
 * 	Handles the exception if the user does not input a number for any room measurement
 * 	
 */

/**
 * @author Jeseekia
 *
 */
public class RoomSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			String userContinue;
		//Welcome user
		System.out.println("Welcome to the Grand Circus Room Detail Generator!\n\n");
		//Create a scanner to read numerical user input
		Scanner input = new Scanner(System.in);
		
		try {
			do {
				//Prompt user for length in meters	
				System.out.println("Enter the length of your room in meters: ");
				double length = input.nextInt();
				input.nextLine();

				//Prompt user for width in meters
				System.out.println("Enter the width of your room in meters: ");
				double width = input.nextInt();
				input.nextLine();

				//Prompt user for height in meters
				System.out.println("Enter the height of your room in meters: ");
				double height = input.nextInt();
				input.nextLine();

				//Calculate the area
				double area = length * width;

				//Calculate the perimeter
				double perimeter = 2 * (length + width);

				//Calculate the volume
				double volume = length * width * height;

				//Return the area
				System.out.println("Area: " + area);

				//Return the perimeter
				System.out.println("Perimeter: " + perimeter);

				//Return the volume
				System.out.println("Volume: " + volume);

				//Ask user if they would like to continue
				System.out.println("Would you like to continue?(y/n)");
				userContinue = input.nextLine();

			} while (userContinue.equalsIgnoreCase("y") == true);
			
			//If the user enters n or N the program will confirm exiting and close the input resource
			if (userContinue.equalsIgnoreCase("n") == true) {
				System.out.println("The program will exit now.");
				input.close();
			} 
		} catch (Exception e) {
			//Throws an exception if the user does not enter a positive number
			System.out.println("Error! You did not enter a positive number.");
		}
			//Allows the program to confirm with the user that they did not enter y/n/Y/N and exits the program
			//Introduces an issue with the if-statement that checks if userContinue == y
			finally {
				System.out.println("You did not enter a proper response (y/n). The program will exit now.");
			}
			
	}

}
