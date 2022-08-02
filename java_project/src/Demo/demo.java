package Demo;

public class demo {
	int id;
	String name;
	
	demo(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + " " + name;
	}
	public String toString1() {
		return id + " ===== " + name;
	}
	
	
	
}
