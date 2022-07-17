package project_test;

import java.util.Scanner;

public class quiz {
	public static void main(String args[]) {
		
		while(true){
			
			System.out.println("\nWho in avengers died during end game?");
			System.out.println("1. Captain Marvel \n2. Thor \n3. Captain America \n4.Iron Man ");
			
			//provide the input through scanner
			Scanner sc = new Scanner(System.in);
			System.out.println("\nChoose the correct option = ");
			int option  = sc.nextInt();
			
			//conditions for choosing the option
			if(option == 4) {
				System.out.println("You choosed the correct option.");
				break;
			}
			else if(option == 1 || option == 2 || option == 3) {
				System.out.println("You choosed the wrong option. Try again!!!");
			}
			else if(option == 5) {
				System.out.println("Exiting the quiz");
				break; 
			}
			else {
				System.out.println("Please enter a valid option!!!");
			}
		}	
		
	}

}
