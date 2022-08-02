package package2;

public class Outer {
	static class Inner{
		static void method() {
			System.out.println("Static inner method");
		}
		void methodOut() {
			System.out.println("non static inner method");
		}
		
	}
	static void method1() {
		System.out.println("static method: Outer1");
		
	}
	public static void main(String[] args) {
		Outer.method1();
		
		Outer.Inner.method();
		
		Outer.Inner in = new Outer.Inner();
		in.methodOut();
	}
}
