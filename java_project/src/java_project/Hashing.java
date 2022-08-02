package java_project;
import java.util.*;
public class Hashing {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Alen");
		hm.put(2, "boolen");
		hm.put(3, "cable");
		
		System.out.println("The elements in HashMap are: ");
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
			
		}
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(4, "Alex");
		ht.put(5, "daddy");
		ht.put(6, "elena");
		System.out.println("The elemetns of hashtable are :");
		for(Map.Entry h : ht.entrySet()) {
			System.out.println(h.getKey() + " " + h.getValue());
		}
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(7, "fish");
		map.put(8,  "goat");
		map.put(9,  "horse");
		
		System.out.println("Elemnents of TreeMap: ");
		for(Map.Entry ele : map.entrySet()) {
			System.out.println(ele.getKey() + " " + ele.getValue());
		}
	}
	
}
