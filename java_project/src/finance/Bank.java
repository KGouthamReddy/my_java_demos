package finance;

public class Bank {
	
	public int bankNo = 10;
	public float bankBalance;
	static String bankName = "SBI";
	static String AccType = "Savings";
	
	
	public void Bank(int bankNum, float bankBal) {
		this.bankBalance = bankBal;
		this.bankNo = bankNum;
	}
	
	public void printDetails() {
		System.out.println("Bank Account Number: " + this.bankNo);
		System.out.println("Bank Account Balance: " + this.bankBalance);
		System.out.println("Bank Name: " + Bank.bankName);
		System.out.println("Bank Account Tyep: " + Bank.AccType);
		
	}

}
