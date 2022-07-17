package javaunittestreports;

import java.util.Scanner;

public class StudentMark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float chemistry_marks, physics_marks, maths_marks;
		
		System.out.println("Enter the physics marks out of 100 : ");
		chemistry_marks = sc.nextFloat();
		System.out.println("Enter the chemistry marks out of 100: ");
		physics_marks = sc.nextFloat();
		System.out.println("Enter the maths marks out of 100: ");
		maths_marks = sc.nextFloat();
		
		float total_marks = getTotalMarks(chemistry_marks, physics_marks, maths_marks);
		System.out.println("Total marks out of 300 is " + total_marks);
		
		float percentage = getPercent(chemistry_marks, physics_marks, maths_marks);
		System.out.println("percentage out of 100 is " + String.format("%.2f", percentage));
		
	}
	public static String getGrade(float percentage) {
		if(percentage > 100 || percentage < 0) {
			throw new ArithmeticException("Invaid percentage error");
		}
		
		if(percentage >= 80) {
			return "A+";
		}
		else if(percentage >= 60 && percentage < 79) {
			return "A";
		}
		else if(percentage >= 50 && percentage < 69) {
			return "B";
		}else {
			return "C";
		}
	}
	
	public static float getTotalMarks(float chemistry_marks, float physics_marks, float maths_marks) {
		if(chemistry_marks > 100 || physics_marks > 100 || maths_marks > 100) {
			throw new ArithmeticException("Invalid marks error");
		}
		else if(chemistry_marks < 0 || physics_marks < 0 || maths_marks < 0) {
			throw new ArithmeticException("Invalid marks error");
		}
		
		float total_marks = chemistry_marks + physics_marks + maths_marks;
		return total_marks;
	}
	
	public static float getPercent(float chemistry_marks, float physics_marks, float maths_marks) {
		if(chemistry_marks > 100 || physics_marks > 100 || maths_marks > 100) {
			throw new ArithmeticException("Invalid marks error");
		}
		else if(chemistry_marks < 0 || physics_marks < 0 || maths_marks < 0) {
			throw new ArithmeticException("Invalid marks error");
		}
		
		float total_marks = chemistry_marks + physics_marks + maths_marks;
		float percentage = (total_marks / 300) * 100;
		return percentage;
	}
	
}




