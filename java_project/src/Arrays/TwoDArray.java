package Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		//int[][] a  = new int[3][3];
		
//		int [][] matrix = {{1,2,3}, {4,5,6}};
//		
//		for(int i=0; i< matrix.length; i++) {
//			for(int j=0; j<matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println(" ");
//		}
		int a[] = {78, 34, 21, 11,9};
		int sum=0;
		for (int k = 0; k < a.length; k++) {
			sum+=a[k];
		}
		System.out.println(sum);
		
		int add=0;
		for(int element : a) {
			add+=element;
		}System.out.println(add);
	}
}
