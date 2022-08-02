package java_project;

public class Dog {
	String name;
	String breed;
	int age;
	String color;
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return ("Hi my name is " + getName() + "\n age \n" +getAge()+ " \nbreed \n" + getBreed() + "\nColor \n" + getColor());
		
	}
	public static void main(String[] args) {
		Dog scott = new Dog("Scott", "Papillion" , 2, "Black");
		System.out.println(scott.toString());
	}
}
