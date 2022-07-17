package project_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentData{
	public static void main(String args[]) {
		ArrayList<learners> stu = new ArrayList<learners>();
		
		stu.add(new learners(121, "Alen"));
		stu.add(new learners(124, "Alen"));
		stu.add(new learners(137, "Alen"));
		stu.add(new learners(172, "Alen"));
		stu.add(new learners(148, "Alen"));
		stu.add(new learners(113, "Alen"));
		stu.add(new learners(130, "Alen"));
		
		System.out.println("Students data before sorting...");
		for(int i=0; i<stu.size(); i++) {
			System.out.println(stu.get(i));
		}
		
		System.out.println("Student data after sorting...");
		Collections.sort(stu, new Sortbyregno());
		for(int i = 0; i<stu.size(); i++) {
		System.out.println(stu.get(i));
		}
	}
	
}
class learners{
	int regNo;
	String name;
	
	public learners(int regNo, String name) {
		this.regNo = regNo;
		this.name = name;
	}
	public String toString() {
		return this.regNo + "   |    " + this.name;
	}
}

class Sortbyregno implements Comparator<learners>{
	public int compare(learners a, learners b) {
		return a.regNo - b.regNo;
	}
}


