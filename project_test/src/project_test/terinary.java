package project_test;
import java.util.*;

public class terinary {
	public static void main(String args[]) {
		
		int fee = 20000;
		
		boolean canJoin = true;
		
		canJoin = (fee < 50000)? true : false;
		
		System.out.println(canJoin);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		int age = sc.nextInt();
		
		System.out.println("Do you have a liscenc true / false ");
		
		boolean haveLicense = true;
		
		String checkLisence = sc.next();
		
		if(checkLisence == "true") {
			haveLicense = true;
		}else {
			haveLicense = false;
		}
		
		boolean canDrive = (age > 18) ? true : false;
		
		boolean canRentCar = canDrive ? (haveLicense ? true : false) : false;
		
		System.out.println("Have a lisence "+haveLicense);
		System.out.println("Can he drive "+canDrive);
		System.out.println("Can he rent a car "+ canRentCar);
		
	}

}
