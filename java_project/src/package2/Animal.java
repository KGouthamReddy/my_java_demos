package package2;

public class Animal {
//	class dog{
//		void method1(){
//			System.out.println("method 1");
//		}
//		void method2() {
//			System.out.println("method2");
//		}
//	}
//	void method() {
//		System.out.println("Outer class method");
//	}
//	
//	class cat{
//		void methodC() {
//			System.out.println("new cat");
//		}
//	}
//	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.method();
//		
//		Animal.dog d = a.new dog();
//		d.method1();
//		d.method2();
//		
//		Animal.cat c = a.new cat();
//		c.methodC();
//		
//		
//				
//	}
	
	
	
	
	
	private static int x = 50;
	private int y;
	
	Animal(int y){
		this.y = y;
	}
	void f1() {
		System.out.println("Outer class Non static method f1");
	}
	
	
	class Inner {
		private int y;
		
		Inner(int y){
			this.y = y;
			
		}
		void f2() {
			System.out.println("Outer class x: " + Animal.x);
			System.out.println("Outer clas y: " + Animal.this.y);
			System.out.println("inner class y: "+ this.y);
		}
	}
}
