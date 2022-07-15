package project_test;
import java.util.*;

public class vowels {
	public static void main(String args[]) {
		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter an aplhabet to check whether it is a vowel or not: ");
//			
//			char ch = sc.next().charAt(0);
//			
//			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//				System.out.println("It is a vowel\n");
//			}
//			else {
//				System.out.println("It is not a vowel\n");
//			}
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence:  ");
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		System.out.println(st);
		
		System.out.println("\nVowel count for each word in the string");
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			System.out.println("Processing word: " + word);
			int vowelCount = 0;
			for(char ch: word.toCharArray()) {
				ch = Character.toLowerCase(ch);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				}
			}System.out.println("The word" + word + " has " + vowelCount + " vowels");
			
		}
		

	}
}