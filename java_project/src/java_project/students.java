package project_test;

public class students {
	
	int regNo;
	String Name;
	
	public students(int regNo, String Name) {
		this.regNo = regNo;
		this.Name = Name;
	}
	
	
	public static void main(String a[]) {
		students[] s;
		
		s = new students[3];
		s[0] = new students(1, "Alen");
		s[1] = new students(2, "Berry");
		s[2] = new students(3, "Cherry");
		
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i].regNo + " " + s[i].Name);
		}
		
	}
}
