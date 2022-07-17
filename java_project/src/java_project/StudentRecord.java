package project_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRecord{

	int regNo;
	String Name;
	
	public StudentRecord(int regNo, String Name) {
		this.regNo = regNo;
		this.Name = Name;
	}
	
	public String toString() {
		return this.regNo + " " + this.Name;
	}
	
	public static void main(String args[]) {
		List stud = new ArrayList();
		
		stud.add(new StudentRecord(1232435, "Blen"));
		stud.add(new StudentRecord(1232245, "Alen"));
		stud.add(new StudentRecord(1232431, "Alen"));
		stud.add(new StudentRecord(1232432, "Clen"));
		stud.add(new StudentRecord(1232467, "Flen"));
		stud.add(new StudentRecord(1232430, "Dlen"));
		
		Collections.sort(stud, new Sortbyregno());
		
		System.out.println("After sorting...");
		for(int i=0; i<stud.size();i++) {
			System.out.println(stud.get(i));
		}
	}

}
class Sortbyregno implements Comparator<StudentRecord> {
	public int compare(StudentRecord a, StudentRecord b) {
		return a.regNo - b.regNo;
	}
}

