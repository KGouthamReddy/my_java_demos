package java_project;


class Encapsulate{
	int Age;
	String Name;
	int Roll;
	
	public int getAge() {
		return Age;
	}
	public String getName() {
		return Name;
	}
	public int getRoll() {
		return Roll;
	}
	public void setAge(int newAge) {
		Age = newAge;
	}
	public void setName(String newName) {
		Name = newName;
	}
	public void setRoll(int newRoll) {
		Roll = newRoll;
	}
}
public class TestEncapsulation {

	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		obj.setName("harsh");
		obj.setAge(42);
		obj.setRoll(123);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getRoll());
	}
}
