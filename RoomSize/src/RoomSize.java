import java.util.Scanner;

/**
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
			if (userContinue.equalsIgnoreCase("n") == true) {
				System.out.println("The program will exit now.");
				input.close();
			} 
		} catch (Exception e) {
			System.out.println("Error! You did not enter a positive number.");
		}
			
	}

}
