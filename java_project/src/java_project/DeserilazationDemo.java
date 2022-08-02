package java_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilazationDemo {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			FileInputStream fis = new FileInputStream("C:\\\\javafsd\\\\my_java_demos\\\\emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis); {

				employeeSerliaze emp1 = (employeeSerliaze) ois.readObject();

			System.out.println("Employee object Deserialized");

			System.out.println(emp1);
		}
		}
}
