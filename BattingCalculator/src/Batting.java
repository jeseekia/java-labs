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

		int userNumBatters;
		int userAtBat;
		int userNumBases;
		int i;
		int j;
		// int k;
		int batterNumber = 0;
		int maxAtBat = 0;
		int currentAtBat = 0;
		DecimalFormat formatter = new DecimalFormat("#0.000");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of batters");
		userNumBatters = input.nextInt();
		
		int[] [] batters = new int[userNumBatters] [];
		double[] [] outputArray = new double[userNumBatters] [2];
		for(i=0; i<userNumBatters; i++) {
			batterNumber = i+1;
			System.out.println("Enter the number of times at bat for Batter #" + batterNumber);
			userAtBat = input.nextInt();
			batters[i] = new int[userAtBat];
			
			int bCount = 0;
			int bNumber = 0;
			
			for(j=0; j<userAtBat; j++) {
				currentAtBat = j+1;
				maxAtBat = userAtBat;
				System.out.println("Enter the number of bases "+ currentAtBat + "/" + maxAtBat);
				
				userNumBases = input.nextInt();//between 0 and 4
				
				batters [i][j] = userNumBases;
				
				if(batters[i][j] > 0) {
					bNumber += batters[i][j];
					bCount++;
				}
				
			}
			
			
			float bCountCast = bCount;
			float userAtBatCast = userAtBat;
			float bNumberCast = bNumber;
			double battingAverage = bCountCast/userAtBatCast;
			double sluggingPercentage = bNumberCast/userAtBatCast;
			
			outputArray[batterNumber-1][0] = battingAverage;
			outputArray[batterNumber-1][1] = sluggingPercentage;
			
			
			
			System.out.println();
			System.out.println("bCount: " + bCount);
			System.out.println("bNumber: " + bNumber);
			System.out.println("Batting average: " + formatter.format(battingAverage));
			System.out.println("Slugging percentage: " + formatter.format(sluggingPercentage));
			
		}
		
		for (int a=0; a<batters.length; a++) {
			
			for(int b=0; b<batters[a].length; b++) {
				System.out.print(batters[a][b] + "\t");
			}
			System.out.println();
		}
		
					
		for(int d=0; d<outputArray.length; d++) {
			System.out.println("Batting average: " + formatter.format(outputArray[d][0]));
			System.out.println("Slugging percentage: " + formatter.format(outputArray[d][1]));
			System.out.println();
		}
					
		
		input.close();
	}

}
