package project_test;

public class CheckPolymorphism {
	
	public static void main(String args[]) {
		HouseArchitecture ha;
		
		ha = new Villas();
		System.out.println("Price of villas: "+ String.format("%.0f", ha.getPrice()));
		System.out.println("Banks who can provide loan: " + ha.getLoanBank());
		
		ha = new FarmHouse();
		System.out.println("Price of FarmHouse: "+ String.format("%.0f", ha.getPrice()));
		System.out.println("Banks who can provide loan: " + ha.getLoanBank());
		
		ha = new Apartments();
		System.out.println("Price of Apartments: "+ String.format("%.0f", ha.getPrice()));
		System.out.println("Banks who can provide loan: " + ha.getLoanBank());
	}
}
