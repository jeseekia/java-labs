import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jeseekia
 *
 */
public class Batting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int userNumBatters=0;
		int userAtBat=0;
		int userNumBases = 0;
		int i;
		int j;
		// int k;
		int batterNumber = 0;
		int maxAtBat = 0;
		int currentAtBat = 0;
		DecimalFormat formatter = new DecimalFormat("#0.000");
		
		Scanner input = new Scanner(System.in);
//Start of validating userNumBatters
		boolean isValidInteger;
		do {
			System.out.println("Enter the number of batters");
			if(input.hasNextInt()) {	//userNumBatters must be an integer
				userNumBatters = input.nextInt();
				if(userNumBatters > 0){	//userNumBatters must be greater than 0
					isValidInteger = true;						
				} else {
					isValidInteger = false;
				}
			}
			else {
				System.out.println("That is not a valid choice.");
				isValidInteger = false;
				input.next();
			}
		}
		while(!isValidInteger);
//End of validating userNumBatters
		
		
		int[] [] batters = new int[userNumBatters] [];				//Array to hold all of the stats entered by the user. Rows = userNumBatters and columns = userAtBat for each batter entered.
		double[] [] outputArray = new double[userNumBatters] [2];	//Array to hold the battingAverage and sluggingPercentage calculated below
//The outer for loop determines the number of times at bat for the batter		
		for(i=0; i<userNumBatters; i++) {
			batterNumber = i+1;
//Start of validating userAtBat			
			do {
				System.out.println("Enter the number of times at bat for Batter #" + batterNumber);
				if(input.hasNextInt()) { //userAtBat must be an integer
					userAtBat = input.nextInt();
					isValidInteger = true;
					}
				else {
					System.out.println("That is not a valid choice.");
					isValidInteger = false;
					input.next();
				}
			}
			while(!isValidInteger);
//End of validating userAtBat	
			
			
			batters[i] = new int[userAtBat];	//This line defines the number of columns for the current batter
			
			int bCount = 0;						//bCount is the number of times the batter did not get an out
			int bNumber = 0;					//bNumber is used to calculate the total number of bases each time the batter was at bat
			
			for(j=0; j<userAtBat; j++) {
				currentAtBat = j+1;				//Used to output which time at bat the user is entering. It is just the index shifted up by 1.
				maxAtBat = userAtBat;			//Used to output the number of total times the current batter was at bat
//Start of validating userNumBases
				do {
					System.out.println("Enter the number of bases "+ currentAtBat + "/" + maxAtBat);
					if(input.hasNextInt()) { //userNumBases must be an integer
						userNumBases = input.nextInt();
						if(0<=userNumBases && userNumBases<=4){ //userAtBat must be 0,1,2,3,or 4
							isValidInteger = true;						
						} else {
							System.out.println("That is not a valid choice.");
							isValidInteger = false;
						}
					}
					else {
						System.out.println("That is not a valid choice.");
						isValidInteger = false;
						input.next();
					}
				}
				while(!isValidInteger);				
//End of validating userNumBases				
				
				batters [i][j] = userNumBases;
				
				if(batters[i][j] > 0) {			//As long as the at bat value is not 0, bCount and bNumber will be updated
					bNumber += batters[i][j];
					bCount++;
				}
				
			}
			
//Calculate battingAverage and sluggingPercentage by casting int to float and storing the calculated result in a double
			float bCountCast = bCount;
			float userAtBatCast = userAtBat;
			float bNumberCast = bNumber;
			double battingAverage = bCountCast/userAtBatCast;			
			double sluggingPercentage = bNumberCast/userAtBatCast;		
//Assign battingAverage and sluggingPercentage to the outputArray for displaying results at the end of the program			
			outputArray[batterNumber-1][0] = battingAverage;
			outputArray[batterNumber-1][1] = sluggingPercentage;
			
		}
//End of Batter input
		
		
		
//Iterates through the batting stats array to display the user's input		
		for (int a=0; a<batters.length; a++) {
			
			for(int b=0; b<batters[a].length; b++) {
				System.out.print(batters[a][b] + "\t");
			}
			System.out.println();
		}
		
					
//Iterates through the output array and outputs the Batting average and Slugging percentage for each entered batter		
		for(int d=0; d<outputArray.length; d++) {
			batterNumber = d+1;
			System.out.println("Results for " + batterNumber + ":");
			System.out.println("Batting average: " + formatter.format(outputArray[d][0]));
			System.out.println("Slugging percentage: " + formatter.format(outputArray[d][1]));
			System.out.println();
		}
					
		
		input.close();	//Closes the Scanner
	}

	
	
/*This method is for validating integers. It is not currently implemented
 *It should take in the userInput as well as a String message explaining what 
 *type of info should be entered and return the number if it is an integer 
 *otherwise the user should be reprompted
 */
	public static int validateInteger(int userInput, String inputMessage) {
		Scanner input = new Scanner(System.in);
		boolean isValidInteger;
		int validInteger = 0;
		do {
			System.out.println(inputMessage);
			if(input.hasNextInt()) {
				validInteger = input.nextInt();
				isValidInteger = true;
			}
			else {
				System.out.println("That is not a valid choice.");
				isValidInteger = false;
				input.next();
			}
		}
		while(!isValidInteger);
		return validInteger;
		
	}

}
