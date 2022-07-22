package java_project;

public class constructors {
	
						//default constructor
	
	int id;
	String name;
//	
//	void display() {
//		System.out.println(id + " " + name);
//	}
	
					
		
	//paramaterized constructor
	constructors(int i, String n){
		this.id = i;
		this.name = n;
	}
	void display() {
		System.out.println(id + " " + name);
	}
	
	
	
	public static void main(String[] args) {
		//constructors c = new constructors();
		//c.display();
		constructors c2 = new constructors(101, "qagat");
		c2.display();
		constructors c3 = new constructors(102, "alen");
		c3.display();
	}
}
