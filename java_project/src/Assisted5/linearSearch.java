package Assisted5;

import java.util.ArrayList;
import java.util.Scanner;

public class linearSearch {
	public static void main(String[] args) {
		//int[] arr = {1, 43, 4 ,766, 32};
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(32);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search: ");
		int value = sc.nextInt();
		int result = linear_search(arr, value);
		if(result == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Elemnent found at index : " + result);
		}
		
	}

	private static int linear_search(ArrayList arr, int value) {
		for(int i=0; i<arr.size(); i++) {
			int search_value = (int) arr.get(i);
			if(value == search_value) {
				return i;
			}
		}return -1;
	}
}
