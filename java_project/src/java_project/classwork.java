package project_test;

public class classwork{
	public static void main(String args[]) {
		
		//print the sum of the numbers which are divisible by 3 and 5 between 1 to 100
		
//		int sum = 0;
//		for(int i=1; i<100; i++){
//			if(i % 3 == 0 && i%5==0) {
//				sum = sum + i;
//			}
//		}System.out.println(sum);
		
		
		
		//print the sum of the first five numbers which are divisible by 3 and 5 between 1 to 100
		
		int sum = 0;
		int count = 0;
		for(int i=1; i<100; i++){
			if(i % 3 == 0 && i%5==0) {
				sum = sum + i;
				count++;
			}
			if(count == 5) {
				break;
			}
		}System.out.println(sum);
	}
}