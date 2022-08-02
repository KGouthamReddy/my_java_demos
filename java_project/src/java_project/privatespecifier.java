package package2;

class accessSpecifiers{
	private void display() {
		System.out.println("you are using private access specifier");
		
	}
}

public class privatespecifier{
	public static void main(String[] args) {
		System.out.println("Private access specifier");
		accessSpecifiers as = new accessSpecifiers();
		as.display();
	}
}