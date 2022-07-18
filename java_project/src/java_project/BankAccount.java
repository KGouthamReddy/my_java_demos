package java_project;

public class BankAccount {
	public static void main(String[] args) {
		RegularCustomer regCustomer1 = new RegularCustomer("R123", "Krishna","Domestic", 100000);
		RegularCustomer regCustomer2 = new RegularCustomer("R353", "venkat","Business", 100000);
		
		EnterpriseCustomer entCustomer1 = new EnterpriseCustomer("E173", "ewwofv","Smallscale", 100000);
		EnterpriseCustomer entCustomer2 = new EnterpriseCustomer("E893", "astga","Bigsclae", 100000);
		
		regCustomer1.showCustomerDetails();
		System.out.println("Final amount: " + regCustomer1.get_final_amount(5, 8));
		
		regCustomer2.showCustomerDetails();
		System.out.println("Final amount: " + regCustomer2.get_final_amount(5, 8));
		
		entCustomer1.showCustomerDetails();
		System.out.println("Final amount: " + entCustomer1.get_final_amount(5, 8));
	
		entCustomer2.showCustomerDetails();
		System.out.println("Final amount: " + entCustomer2.get_final_amount(5, 8));
		
	}

}
