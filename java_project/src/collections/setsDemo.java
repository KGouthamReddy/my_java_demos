package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class setsDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
//		set.add(234);
//		set.add(234);
//		set.add(123);
//		set.add(231);
		System.out.println(set);
		
		TreeSet<Object> tree = new TreeSet<>();
		
		List<Integer> list = new ArrayList<>();
		
		Random random = new Random();
		for(int i=0; i<5; i++) {
			Integer randNum = random.nextInt(100);
			System.out.println(randNum);
			list.add(randNum);
			set.add(randNum);
			//tree.add(randNum);
		}
		System.out.println(list);
		System.out.println(set);
		System.out.println(tree);
		
		tree.add("asdgrf");
		tree.add("swarg");
		tree.add("faggy");
		System.out.println(tree);
		
		
		for(Object i : tree) {
			System.out.println(i);
		}System.out.println("----------");
		for(int j: list) {
			System.out.println(j);
		}System.out.println("----------");
		for(int k : set) {
			System.out.println(k);
		}System.out.println("----------");
		
	}
}
