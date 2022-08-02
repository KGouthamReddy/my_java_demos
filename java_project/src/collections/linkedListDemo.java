package collections;

import java.util.LinkedList;

public class linkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(12);
		list.add(234);
		
		System.out.println(list);
		
		for (int i = 0; i < 100; i+=5) {
			list.add(i);
			
		}
		System.out.println(list);
		
		list.remove();
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.remove(new Object());
		System.out.println(list);
	}
}
