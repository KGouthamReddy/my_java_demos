package project_test;

public class students {

	int regNo;
	String stuName;
	
	students(int regNo, String stuName){
		this.regNo = regNo;
		this.stuName = stuName;
	}
	
	public static void main(String args[]) {
		students[] arr;
		
		arr = new students[5];
		arr[0] = new students(1, "alen");
		arr[1] = new students(2, "swrjg");
		arr[2] = new students(3, "kiemn");
		arr[3] = new students(4, "atish");
		arr[4] = new students(5, "riva");
		
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i].regNo + "  " + arr[i].stuName);
		}
		
	}
}
