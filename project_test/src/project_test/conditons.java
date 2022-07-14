package project_test;

public class conditons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isCat = false;
		
		int Integer = 0;
		
		if(Integer == 0) {
			System.out.println("it is a cat");
		}else {
			System.out.println("It is not a cat");
		}

		
		int a = 3;
		int b = 4;
		int c = 5;
		
		System.out.println(a > b && a < c);    // logical AND
		System.out.println(a < b & a > c);  // bitwise AND
		
		
		System.out.println(a > b || a < c);    // logical OR
		System.out.println(a < b | a > c);  // bitwise OR
	}

}
