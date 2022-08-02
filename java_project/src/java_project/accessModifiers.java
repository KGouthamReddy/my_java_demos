package java_project;

import package2.protectedSpecifier;
import package2.publicSpecifier;
//class accessModifier1 {
//	void display() {
//		System.out.println("Default access modifier");
//	}
//}



public class accessModifiers extends protectedSpecifier{
	public static void main(String[] args) {
		System.out.println("Topic of access modifers");
//		accessModifier1 m1 = new accessModifier1();
//		m1.display();
		
//		protectedSpecifier ps = new protectedSpecifier();
//		ps.display();
		
		publicSpecifier pub = new publicSpecifier();
		pub.display();
	}
}