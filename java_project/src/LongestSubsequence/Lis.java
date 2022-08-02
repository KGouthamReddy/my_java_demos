package LongestSubsequence;

import java.util.Arrays;
import java.util.Scanner;

public class Lis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		System.out.println("Enter the elements: ");
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		
		Lis x = new Lis();
		x.lengthofLis(num);
		System.out.println("Length of longest subsequence is: "+ x.lengthofLis(num));
	}

	private int lengthofLis(int[] nums) {
		if(nums.length<=1) {
			return nums.length;
		}
		int[] dp = new int[nums.length];
		int max=-1;
		Arrays.fill(dp, 1);
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<i; j++) {
				if(nums[j] < nums[i]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
