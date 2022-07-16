package project_test;
import java.util.*;
public class Linkedlist {
	
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("First");
		list.add("First");
		list.add("First");
		list.add("First");
		list.add("LAST");
		
		System.out.println(list);
		
		Iterator itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr = list.descendingIterator();
		
		System.out.println("list in reverse order>>>");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("Elements in the linked list::::" + list);
		list.removeFirst();
		System.out.println("List after removing first element>>>" + list);
		
		System.out.println("Elements in the linked list::::" + list);
		list.removeLast();
		System.out.println("List after removing last element>>>" + list);
		
		list.clear();
		System.out.println(list);
	}

}
