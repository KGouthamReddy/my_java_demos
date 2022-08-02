package package2;

public class newOuter {
	
	
	void method() {
		
		System.out.println("outer method");
		
		class innerClass{
			void inner() {
				System.out.println("Inner method");
			}
		}
		
		innerClass in = new innerClass();
		in.inner();
	}
}
