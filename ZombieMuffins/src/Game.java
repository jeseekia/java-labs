import java.util.Scanner;

/**
 * This is a text-based adventure game created as Lab Number 2 of the Java Bootcamp
 * Build Specifications:
 * 		Using switch or if statements, take different actions depending on user input
 * 		Print your story to the console
 * Extra Challenges:
 * 		Include a set  of parameters so that the game ends officially
 * 		Ask for user information at the beginning of the game and use it in the story
 */

/**
 * @author Jeseekia
 *
 */
public class Game {

	public static void main(String[] args) {
		boolean gameOn = false;
		String state;
		Scanner input = new Scanner(System.in);
		String choice;
		
//		boolean isValidChoice = choice.matches("^[ynYN]$");
//				while (!isValidChoice) {
//					System.out.println("That is not a valid option");
//					System.out.println("Continue?");
//					choice = input.nextLine();
//				isValidChoice = choice.matches("^[ynYN]$");
//				}
		
		System.out.println("Welcome to Zombie Muffins! What is your name? (enter your first name): ");
		String userName = input.nextLine();
		System.out.println("HI, " + userName + "! Would you like to play a game? (enter \"yes\" or \"no\"): ");
		choice = input.nextLine();
		
		
		if(choice.equalsIgnoreCase("yes") == true) {
			gameOn = true;
			} else {
				System.out.println("Well, that's ok. Come back soon if you're up to playing!");
			}
		state = "startingRoom";
		
		while(gameOn) {
			
				switch(state) {
				
				case "startingRoom":
					System.out.println("You\'re home alone watching TV when you here a breaking news report. \n Newscaster: \"Zombies are roaming the streets looking for brains! Lock your doors!!!!\" \n Do you lock your doors first or grab a weapon?(\"weapon\"/\"door\")");
					choice = input.nextLine();
						
						if(choice.equalsIgnoreCase("weapon") == true) {
							state = "weapon";
						} else if (choice.equalsIgnoreCase("door") == true)
						{
							state = "door";
						} else {
							System.out.println("It seems you didn\'t enter a valid input.");
							state = "startingRoom";
						}
				break;
				
				case "weapon":
					System.out.println("You wanted a weapon! You can choose between \"muffins\" or a \"machete\"");
					choice = input.nextLine();
						if(choice.equalsIgnoreCase("muffins") == true) {
							state = "muffins";
						} else if (choice.equalsIgnoreCase("machete") == true)
						{
							state = "machete";
						} else {
							System.out.println("It seems you didn\'t enter a valid input.");
							state = "deadEnd";
						}
				break;
				
				case "door":
					System.out.println("You locked your door!");
					state = "deadEnd";
				break;
				
				case "muffins":
					System.out.println("You chose muffins! Interesting choice...");
					state = "deadEnd";
				break;
				
				case "machete":
					System.out.println("You chose a machete!");
					state = "deadEnd";
				break;
				
				
				case "gameOver":
					gameOn = false;
					System.out.println("The game is ending...");
				break;
				
				case "deadEnd": //A case for testing states that don't have the next case defined yet
					gameOn = false;
					System.out.println("This is the deadEnd placeholder.");
				}
			
		}
		

	}

}
