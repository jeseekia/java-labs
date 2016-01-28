import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x, y;
		
		
		System.out.println("Enter your number: ");
		int userNumber = scan.nextInt();
		int jeseekia = 1;
		

		System.out.println("Number\t\tSquared\t\tCubed");
		System.out.println("=======\t\t=======\t\t======");
		
				for(int j=1; j<=userNumber; j++){
					
					int number = power(j,2);
					int number2 = power(j,3);
					System.out.printf("%d\t\t%d\t\t%d\n",j,number,number2);
				}
		
		
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	public static int power(int x, int y) {
		int result=1;
		for (int i = 1; i <= y; i++) {
            result = result * x;
		}
		return result;
	}	

}
