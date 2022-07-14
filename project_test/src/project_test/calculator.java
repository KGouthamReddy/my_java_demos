package project_test;
import java.util.*;

public class calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1 = ");
		double num1 = sc.nextDouble();
		System.out.println("Enter the value of num2 = ");
		double num2 = sc.nextDouble();
		System.out.println("Enter the operator sign= ");
		char sign = sc.next().charAt(0);
		
		double result = 0;
		
		if(sign == '+') {
			result = num1 + num2;
			System.out.println("The addition of num1 and num2 is   " + result);
			
		}
		else if(sign == '-') {
			result = num1 - num2;
			System.out.println("The substraction of num1 and num2 is   " + result);
		}
		else if(sign == '*') {
			result = num1 * num2;
			System.out.println("The multiplication of num1 and num2 is   " + result);
		}
		else if(sign == '/') {
			result = num1 / num2;
			System.out.println("The division of num1 and num2 is   " + result);
		}
		else {
			System.out.println("Please enter a valid operation sign !!?");
		}
		
	
	}

}
