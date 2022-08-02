package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("hekllo");
		set.add("sfrtf");
		set.add("dsg");
		set.add("dgfth");
		set.add("dgfthyhvyh");
		
		System.out.println(set);
		
		Set<String> set1 = new TreeSet<>(new StringLengthComparator());
		set1.add("hekllo");
		set1.add("sfrtf");
		set1.add("dsg");
		set1.add("dgfth");
		set1.add("dgfthyhvyh");
		
		System.out.println(set1);
	}
}
