package project_test;
import java.util.*;
public class calendar {
	public static void main(String args[]) {
		Calendar c = Calendar.getInstance();
		System.out.println("Current Time and Date: "+ c.getTime());
		
		c.add(Calendar.DATE, 123343);
		System.out.println("After some days: " + c.getTime());
	}
}
