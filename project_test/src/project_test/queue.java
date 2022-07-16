package project_test;
import java.util.*;
public class queue {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		
		queue.add("first");
		queue.add("second");
		queue.add("third");
		queue.add("fourth");
		queue.add("fifth");
		
		System.out.println(queue);
		
		System.out.println("Head of the queue: " + queue.peek());
		
		queue.remove();
		System.out.println("Queue after removing an element "+ queue);
		
//		while(! queue.isEmpty()) {
//			queue.remove();
//			System.out.println("Queue after removing an element: "+ queue);
//		}
		
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
