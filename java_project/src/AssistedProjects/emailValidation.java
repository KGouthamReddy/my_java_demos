package AssistedProjects;

import java.util.ArrayList;
import java.util.Scanner;

public class emailValidation {

	public static void main(String[] args) {

		ArrayList<String> emailID = new ArrayList<String>();

		emailID.add("simon.hasler@gmail.com");
		emailID.add("leonie.klein@gmail.com");
		emailID.add("lea.hoch@gmail.com");
		emailID.add("max.neumann@gmail.com");
		emailID.add("henrik.fiesler@gmail.com");
		emailID.add("laura.kramm@gmail.com");
		emailID.add("sabine.neuwirth@gmail.com");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter email: ");
		String searcElement = input.nextLine();

		if (emailID.contains(searcElement)) {
			System.out.println("Email is Found");

		} else {
			System.out.println("Enter email ID " + searcElement + " not found");
		}
	}

}