import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int[] elements = {3,7,3,5,6,8,7,5,3,2,1,0,0,1,1,1,1,7,8,9,15};
		
		//Count the frequency of elements inside the elements array
		Arrays.sort(elements);
		for(int i:elements){
		System.out.println(elements[i]);
		}
		
		int MAX_ARRAY_VALUE = elements[elements.length-1];
		
		int i=0;
		int j=0;
		int frequency = 1;
		
		
		for(int a = 0; a<=MAX_ARRAY_VALUE; a++){
			
			
			if (elements[a] == elements[a + 1]) {
				frequency+=1;
			} 
			
			System.out.println(a + ": " + frequency);
		}
		
		
		
//		for (int x : elements) {
//			
//			if (elements[i] == elements[i + 1]) {
//				frequency+=1;
//			} 
//			
//			System.out.println(x + ": " + frequency);
//		}
		
		
		//Print the frequency of all elements
	}

}
