package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("A");
		l.add("ds");
		l.add("ew");
		l.add("4was");
		l.add("w4df");
		
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println(l);
		
		
		
		
//		--------------------------------------------------
	
	
		int[] a = {123, 3, 5, 0 ,7,3,5};
		System.out.println("before sort");
		
		for(int i: a) {
			System.out.println(i);
		}
		
		Arrays.sort(a);
		System.out.println("after sort");
		for(int j : a) {
			System.out.println(j);
		}
		
		
		
		int result = Arrays.binarySearch(a, 110);
		System.out.println("found at: " + result);
	}
	
	
	
	
	
	
	
}
