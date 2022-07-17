package project_test;

public class EnterpriseCustomer extends customer {


	String customerID;
	String customerName;
	String customerType;
	double amount;
	
	public EnterpriseCustomer(String custID, String custName, String custType, double amt) {
		super(custID, custName, custType);
		
		this.customerID = custID;
		this.customerName = custName;
		this.customerType = custType;
		this.amount = amt;
		
	}
	double get_final_amount(double interest, int year) {
		double simple_interest = this.amount * interest * year;
		double amount = this.amount + simple_interest;
		
		amount = amount - 500;
		if(this.customerType == "SmallScale") {
			return amount - 100;
		}else if (this.customerType == "BigScale") {
			return amount;
		}
		return amount;
	}
	@Override
	double get_final_amt(double interest, int year) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
