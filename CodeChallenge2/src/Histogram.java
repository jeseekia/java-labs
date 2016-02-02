
public class Histogram {

	public static void main(String[] args) {

		int[] elements = {3,7,3,5,6,8,7,5,3,2,1,0,0,1,1,1,1,7,8,9,15};
		
		int max = -10000000;
		
		for(int x : elements) {
			
			if (x>max) {	//this is limited to positive numbers
				max = x;
			}
		}
		
		int[] freq = new int[max+1];
		
		for (int x : elements) {
			
			freq[x]++;
		}
		
		for (int i = 0; i < freq.length; i++) {
			System.out.println("Freq of " + i + ": " + freq[i]);
		}
	}

}
