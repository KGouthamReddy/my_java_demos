package package2;

public class outerTest {
	public static void main(String[] args) {
		Animal an = new Animal(5634);
		an.f1();
		
		Animal.Inner inner = an.new Inner(3563);
		inner.f2();
	}
	
}
