package java_project;

public class ThrowDemo {
	public static void main(String[] args) {
		int a =45;
		int b = 0;
		int result;
		
		try {
			if(b==0) {
				throw(new ArithmeticException("Can't divide by zero"));
			}
			else {
				result = a/b;
				System.out.println("The result :  " +result);
			}
		}catch(ArithmeticException Ex) {
			System.out.println("\n\tError: " + Ex.getMessage());
		}System.out.println("End of the program/");
	}
}
