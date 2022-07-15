package project_test;

import java.util.StringTokenizer;

public class Strings {
	public static void main(String a[]) {
		StringTokenizer s = new StringTokenizer("Hello this is java and i am Alen");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}
}
