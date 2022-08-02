package package2;

public class arrayAssisted {
	public static void main(String[] args) {
		int a[] = {1,2,4,5,6};
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		int[][] b = {{1,2,3}, {4,5,6}};
		System.out.println(b[0].length);
	}
}
