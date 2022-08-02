package phase1;

import java.util.LinkedList;
import java.util.List;

public class demo {
	public static void main(String[] args) {
		List l = new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
	}
}
