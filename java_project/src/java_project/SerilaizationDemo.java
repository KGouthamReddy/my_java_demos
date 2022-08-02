package java_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerilaizationDemo {
	public static void main(String[] args) {
		FileOutputStream fr = new FileOutputStream("C:\\javafsd\\my_java_demos\\emp.ser");
		ObjectOutputStream os = new ObjectOutputStream(fr);
		
		employeeSerliaze(1, "viag", 15000, 1956783567);
		
		os.writeObject(emp1);
		
		
	}

	private static void employeeSerliaze(int i, String string, int j, int k) {
		// TODO Auto-generated method stub
		
	}
}
