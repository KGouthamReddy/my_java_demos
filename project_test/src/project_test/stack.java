package project_test;
import java.util.*;
public class stack {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		
		stack.push("first");
		stack.push("second");
		stack.push("third");
		stack.push("fourth");
		stack.push("fifth");
		stack.push("sixth");
		
		System.out.println(stack);
		
		System.out.println("Enter a string to search in stack: ");
		String s = sc.next();
		
		if(stack.search(s)!= -1) {
			System.out.println("Given string " + s + " exists in stack");
		}
		else {
			System.out.println("Given string doesn't exits in stack");
		}
		
		System.out.println("Getting top element from the stack: " + stack.peek());
		
		//stack.pop();
		
		//System.out.println("Stack after popping out: " + stack);
		
		while(!stack.empty()) {
			stack.pop();
			System.out.println("stack after popping one element "+stack);
		}
		
	}

}
