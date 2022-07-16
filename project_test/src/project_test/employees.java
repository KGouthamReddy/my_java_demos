package project_test;

public class employees {
	
	int emp_ID;
	String emp_Name;
	
	public employees(int emp_ID, String emp_Name) {
		this.emp_ID = emp_ID;
		this.emp_Name = emp_Name;
	}
	
	public static void main(String args[]) {
		employees[] e = new employees[5];
		
		e[0] = new employees(2526695, "Alen");
		e[1] = new employees(2526765, "astgrt");
		e[2] = new employees(2526875, "dgaertyg");
		e[3] = new employees(2527685, "Aadsgaew");
		e[4] = new employees(2524585, "mceiwc");
		
		for(int i = 0; i<e.length; i++) {
			System.out.println(e[i].emp_ID + " | " + e[i].emp_Name);
		}
		
	}
}
