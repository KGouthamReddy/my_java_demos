package collections;

import java.util.ArrayList;
import java.util.List;

public class arrayLists {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(2);
		list.add(4);
		list.add("dtfg");
		System.out.println(list);
		
		ArrayList<Integer> mylist = new ArrayList<>();
		
		mylist.add(2);
		mylist.add(54);
		mylist.add(1, 345);
		mylist.add(35);
		System.out.println(mylist);
		
		ArrayList<String> l = new ArrayList<>();
		
		l.add("add");
		l.add("yout");
		l.add("tube");
		System.out.println(l.indexOf("add"));
		
		
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=0; i<=100; i+=12) {
			list2.add(i);
		}
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(111);
		list3.add(444);
		list3.add(555);
		list3.set(0, 333);     //replace -> set
		list2.addAll(list3);
		
		
		System.out.println(list3);
		System.out.println(list2);
		
		list2.remove(6);
		System.out.println("after remove: " + list2);
		
		list3.remove(new Integer(333));
		System.out.println(list3);

	}
	
	
}
