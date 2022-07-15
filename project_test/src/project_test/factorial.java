package project_test;
import java.util.Scanner;

public class factorial {
	public static void main(String args[]) {
	
		while(true) {
			System.out.println("Enter a number to find the factorial= ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int fact = 1;
			
			for(int i=1; i<=num; i++) {
				fact = fact * i;
			}
			System.out.println("The factorial of the give number is  " + fact + "\n");
		}
	}

}
