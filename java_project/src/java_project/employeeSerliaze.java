package java_project;

import java.io.Serializable;

public class employeeSerliaze implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	double salary;
	long aadharNo;
	
	public employeeSerliaze(int id, String name, double salary, long aadharNo) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.aadharNo = aadharNo;
	}
	@Override
	public String toString() {
		
	return "Id = " + id + "name= " + name + "Salary = " + salary + "aadhar= " + aadharNo;
	}
}
