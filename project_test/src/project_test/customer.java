package project_test;

public abstract class customer {

	String customerID;
	String customerName;
	String customerType;
	
	public customer(String custID, String custName, String custType) {
		this.customerID = custID;
		this.customerName = custName;
		this.customerType = custType;
	}
	
	public void showCustomerDetails() {
		System.out.println("ID of the customer: " + this.customerID);
		System.out.println("name of the customer: " + this.customerName);
		System.out.println("type of customer: " + this.customerType);
		
	}
	abstract double get_final_amt(double interest, int year);

}
