package java_project;

public class newwork {
	
private static final String x = null;
//	static float name;
//	
//	static void method() {
//		System.out.println(" method 1");
//		
//	}
//	static {
//		System.out.println("static block");
//		newwork.method();
//	}
	
	
	
	{
		System.out.println("This is non static method");
	}
	String num = "---";
	
	
	
	newwork(String x){
		this.num = x;
		System.out.println("this is constructor");
	}
	public static void main(String[] args) {
		System.out.println("this is main method");
		newwork new1 = new newwork("helo");
		System.out.println(new1.num);
		}

}
