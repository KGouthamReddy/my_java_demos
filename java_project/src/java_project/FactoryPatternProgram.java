package java_project;

import java.util.Scanner;

public class FactoryPatternProgram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		NetflixPlanFactory planFactory = new NetflixPlanFactory();
		System.out.println("Enter your sub plan: ");
		
		String user_choice = sc.next();
		System.out.println("How many months you want: ");
		int months = sc.nextInt();
		
		NetflixPlan plan = planFactory.getPlan(user_choice);
		
		System.out.println("Monthly bill amount for the plan is: " + plan.getPrice());
		System.out.println("Overall bill amount for the plan is: " + plan.getFinalAmount(months));
	}
}
