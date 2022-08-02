package package2;

public class GCDemoTest {
	public static void main(String[] args) {
		new Employee(3);
		new Employee(2);
		
		Object obj1 = new Employee(3);
		Object obj2 = new Employee(4);
		
		System.gc();
	}
}
