package java_project;

public class Methods {
	
//	int multiply(int a, int b) {
//		int z = a * b;
//		return z;
//		
//	}
	
	
	
	
	//call by value
//	int val = 100;
//	
//	int operation(int val) {
//		val = val*10/100;
//		return val;
//	}
	
	//method overloading
	public void area(int breadth, int height) {
		System.out.println("Area of triangle: "+ ((0.5)*breadth*height));
	}
	public void area(int radius) {
		System.out.println("Area of circle: " + (3.14 * radius * radius));
	}

	public static void main(String[] args) {
//		Methods m1 = new Methods();
//		int result = m1.multiply(34, 7);
//		System.out.println("Result= "+ result);
		
		
		
//		Methods m1 = new Methods();
//		System.out.println("before operation: " + m1.val);
//		m1.operation(5101);
//		System.out.println("after operation: " + m1.val);
		
		
		Methods m2 = new Methods();
		m2.area(5);
		m2.area(12, 6);
		
	}
}
