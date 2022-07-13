package project_test;
import java.util.*;

public class myclass {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hellow world!!!");
		
		for(int i=1; i<=3; i++) {
			System.out.println("Enter your friend name = ");
			String names = s.next();
			System.out.println("friend" + i + " : "+ names);
		}
		System.out.println("...");
		System.out.println("Enter the user name = ");
		String username = s.next();
		greet(username);
	}
	
	public static void greet(String name) {
		System.out.println("Hello " + name);
	}

}
