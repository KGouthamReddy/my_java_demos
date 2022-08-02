package java_project;

public class MyClass1 {
	public static void main(String[] args) {
		int[] array = new int[3];
		try {
			array[7] = 3;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Check the program again!" );
		}
		finally {
			System.out.println(array.length);
		}
	}
}
