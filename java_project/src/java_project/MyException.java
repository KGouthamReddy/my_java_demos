package java_project;

class Example1 extends Exception{
	String str1;
	Example1(String str2){
		str1 = str2;
	}
	public String toString() {
		return ("MyException Occurred: " + str1);
	}
}
public class MyException{
	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			throw new Example1("This is my error messaghe");
			
		}catch(Example1 exp) {
			System.out.println("Catch Block");
			System.out.println(exp);
		}
	}
}