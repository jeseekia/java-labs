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

			
			for(j=0; j<userAtBat; j++) {
				currentAtBat = j+1;
				maxAtBat = userAtBat;
				System.out.println("Enter the number of bases "+ currentAtBat + "/" + maxAtBat);
				userNumBases = input.nextInt();
				
				batters [i][j] = userNumBases;
				
				if(batters[i][j] > 0) {
					bCount++;
				}
				
			}
			
		}
		
		for (int a=0; a<batters.length; a++) {
			
			for(int b=0; b<batters[a].length; b++) {
				//System.out.println(batters[a][b]);	 	//makes it possible for jagged arrays as well
				//System.out.println(batters[a][b]);	// prints by columns instead of rows
				System.out.print(batters[a][b] + "\t");
			}
			System.out.println();
		}
		
	}

}
