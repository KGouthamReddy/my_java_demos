package package2;

public class Employee {
		
	int employeeID;
	
	public Employee(int id) {
		String tname = Thread.currentThread().getName();
		this.employeeID = id;
		System.out.println(tname + ": Employee created - " + this.employeeID);
	}
	
	@Override
	protected void finalize() throws Throwable{
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Employee finalized - "  + this.employeeID);
	}
}
