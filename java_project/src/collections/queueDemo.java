package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class queueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(1);
		q.add(123);
		
		for(int i=10; i<=100; i+=11) {
			q.add(i);
		}
		
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q.remove());
		q.remove(21);
		System.out.println(q);
//	________________________________________________
//
		q.offer(111);
		q.offer(222);
		System.out.println(q);
		
		System.out.println(q.peek());
		
		System.out.println(q.element());
		System.out.println(".............");
		
		for(int i: q) {
			System.out.println(i);
		}
	}
}
