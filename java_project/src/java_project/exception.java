package project_test;

public class exception {
	
	public static void main(String args[]){
		try {
			//int i = 1/0;
			//int[] arr = {1,3,3,6,3};
		//	System.out.println(arr[10]);
			String name = null;
			System.out.println(name.length());
			
		}catch(ArithmeticException e) {
			System.out.println("An exception catched... " + e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + e);
		}
		catch(NullPointerException e) {
			System.out.println("Error: " + e);
			
		}
		finally {
			System.out.println("Trying the exception handling.");
		}
	}

}
