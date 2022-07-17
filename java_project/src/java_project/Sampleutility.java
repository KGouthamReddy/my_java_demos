package project_test;

import java.util.Calendar;

public class Sampleutility {
	public static void main(String args[]) {
		Calendar objCalendar = Calendar.getInstance();
		System.out.println("Month?: " + objCalendar.get(Calendar.MONTH));
		System.out.println("Date: " + objCalendar.get(Calendar.DATE));
		System.out.println("Year: " + objCalendar.get(Calendar.YEAR));
		System.out.println("HOUR: " + objCalendar.get(Calendar.HOUR));
		System.out.println("MINUTE: " + objCalendar.get(Calendar.MINUTE));
		System.out.println("SECOND: " + objCalendar.get(Calendar.SECOND));
		
		objCalendar.add(Calendar.MINUTE, 30);
		java.util.Date objDate = objCalendar.getTime();
		System.out.println("Date and Time");
		System.out.println(objDate);
		
	}

}
