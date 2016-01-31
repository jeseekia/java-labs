import java.util.Scanner;

/**
 * This application is for Java Bootcamp Lab 6 to translate English into Pig Latin
 * The application will
 * 	Prompt the user for a word -done
 * 	Translate the text to Pig Latin and display it on the console
 * 	Ask the user if he or she wants to translate another word -done
 * Build Specifications
 * 	Convert each word to lower case before translating -done
 * 	If a word starts with a vowel just add "way" onto the ending
 * 	If a word starts with a consonant, move all of the consonants that appear before the first vowel to the end of the word, then add "ay" to the end of the word
 * Extended Exercises
 * 	Keep the case of the word, whether its upper case (WORD), title case (Word), or lower case (word)
 * 	Allow punctuation in the input string
 * 	Translate words with contractions
 * 	Don't translate words that have numbers or symbols. Ex: 189 and hello@grandcircus.co should be left as is
 * 	Check that the user has actually entered text before translating
 * 	Make the application take a line instead of a single word, and then find the Pig Latin for each word on the line
 */

/**
 * @author Jeseekia
 *
 */
public class PigLatin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput;
		String userContinue;
		String userPigLatin;
		
		do {
			System.out.println("Enter a word to be converted to Pig Latin");
			// TODO Check if the user puts in appropriate input
//			while ( !valid input   ) {
//				System.out.println("That is not a valid input. Please try again.");
//				input.next();
//			}
			userInput = input.nextLine().toLowerCase();

			userPigLatin = pigLatin(userInput);
			
			System.out.println("Your word has been converted to " + userPigLatin + ".");
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
	
	public static String pigLatin(String input) {
		String newWord = "";
		String word = input;
		if(Character.toString(input.charAt(0)).matches("^[aeiou]$")) { //Converts the char at 0 to the Character class and checks if it is a vowel
			newWord = input.concat("way");
			System.out.println("Vowel newWord: " + newWord);
			return newWord;
		} else {
			while(!Character.toString(word.charAt(0)).matches("^[aeiou]$")) { //needs to be written so that it is checking the updated version of the word after each loop
				
				String charToString = Character.toString(input.charAt(0)); //Converts the first character to a string and stores it in charToString
				char[] wordToArray = input.toCharArray(); //Converts the input to a char array
//				System.out.println(wordToArray); //Test line
				wordToArray[0] = ' ';
				newWord = String.valueOf(wordToArray);
//				System.out.println("Value of: " + newWord); //Test line
				newWord = newWord.trim().concat(charToString).concat("ay");
				word = newWord;
				return word;
			}
		}
		return newWord;
	}

}
