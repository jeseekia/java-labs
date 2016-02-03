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
		int k;
		int batterNumber = 0;
		int maxAtBat = 0;
		int currentAtBat = 0;
		DecimalFormat formatter = new DecimalFormat("#0.000");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of batters");
		userNumBatters = input.nextInt();
		
		int[] [] batters = new int[userNumBatters] [];
		for(i=0; i<userNumBatters; i++) {
			batterNumber = i+1;
			System.out.println("Enter the number of times at bat for Batter #" + batterNumber);
			userAtBat = input.nextInt();
			batters[i] = new int[userAtBat];
			
			int bCount = 0; //HINT LINE
			int bNumber = 0;
			
			for(j=0; j<userAtBat; j++) {
				currentAtBat = j+1;
				maxAtBat = userAtBat;
				System.out.println("Enter the number of bases "+ currentAtBat + "/" + maxAtBat);
				userNumBases = input.nextInt();
				
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
		
	}

}
