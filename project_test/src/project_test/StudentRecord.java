package project_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRecord implements Comparable{

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
		
		Collections.sort(stud);
		
		System.out.println("After sorting...");
		for(int i=0; i<stud.size();i++) {
			System.out.println(stud.get(i));
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.regNo = ((StudentRecord)o).regNo;
		}
	}

