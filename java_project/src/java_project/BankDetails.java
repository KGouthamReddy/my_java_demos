package java_project;

import finance.Bank;

public class BankDetails {
	
	public static void main(String args[]) {
		Bank b1 = new Bank();
		b1.bankBalance = 15000;
//		b1.bankNo = 101;
		
		b1.printDetails();
		System.out.println("");
		
		Bank b2 = new Bank();
		b2.bankBalance = 19000;
		b2.bankNo = 123;
		
		b2.printDetails();
		
		System.out.println("");
		//other type of giving input
		b1.Bank(103, 19500);
		b1.printDetails();
		
		System.out.println("");
		Bank b3 = new Bank();
		b3.Bank(108, 12000);
		b3.printDetails();
		
	}

}
