package java_project;
import java.util.*;
public class collectionAssisted {
	public static void main(String[] args) {
		System.out.println("Array list");
		
		ArrayList<String> city = new ArrayList<String>();
		city.add("Mumbai");
		city.add("Goa");
		city.add("Bangalore");
		
		System.out.println(city);
		
		
		System.out.println("");
		
		System.out.println("vector");
		Vector<Integer> vec = new Vector();
		vec.addElement(123);
		vec.addElement(432);
		System.out.println(vec);
		
		System.out.println("");
		System.out.println("LinketList");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Alen");
		names.add("james");
		names.add("noah");
		System.out.println(names);
		
		System.out.println("");
		System.out.println("hashset");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(2343);
		set.add(2234);
		set.add(2452);
		set.add(2542);
		System.out.println(set);
		
		System.out.println("");
		System.out.println("LLinked HashSet");
		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		lset.add(124);
		lset.add(2342);
		lset.add(23423);
		lset.add(1234);
		System.out.println(lset);
	}
}
