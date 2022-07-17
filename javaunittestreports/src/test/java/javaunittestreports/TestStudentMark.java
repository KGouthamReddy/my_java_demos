package javaunittestreports;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestStudentMark {
	
	
	@Test
	public void test_getTotalMarks() {
		assertEquals(300.0, StudentMark.getTotalMarks(100, 100, 100), 0.0f);
	}
	@Test(expected = ArithmeticException.class)
	public void test_getTotalInvalidMarksAbove() {
		StudentMark.getTotalMarks(1000, 1000, 1000);
	}
	@Test(expected = ArithmeticException.class)
	public void test_getTotalInvalidMarksBelow() {
		StudentMark.getTotalMarks(-1, -1, -1);
	}
	@Test(expected = ArithmeticException.class)
	public void test_getTotalMarksArithmeticCheck() {
		StudentMark.getTotalMarks(20+60+45, 90+60, 10+50);
	}
	@Test
	public void test_getPercent() {
		assertEquals(100.0, StudentMark.getPercent(100, 100, 100), 0.0f);
	}
	@Test(expected = ArithmeticException.class)
	public void test_getPercentInvalidMarks() {
		StudentMark.getPercent(1000, 1000, 1000);
	}
	
	@Test
	public void test_getGrade() {
		assertEquals("A+", StudentMark.getGrade(85));
	}
	@Test(expected = ArithmeticException.class)
	public void test_getGradeInvalidPercent() {
		StudentMark.getGrade(900);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void test_getTotalMarks() {
//		assertEquals(300.0, StudentMark.getTotalMarks(100, 100, 100), 0.0f);
//	}
//	@Test(expected = ArithmeticException.class)
//		public void test_getTotalMarksAbove() {
//			StudentMark.getTotalMarks(1000, 1000, 1000);
//	}
//	@Test(expected = ArithmeticException.class)
//	public void test_getTotalMarksBelow() {
//		StudentMark.getTotalMarks(-1, -1, -1);
//	}
//	@Test(expected = ArithmeticException.class)
//	public void test_getTotalMarksArithmeticCheck() {
//		StudentMark.getTotalMarks(10+80+60, 10+80, 40+60+50);
//	}
//	
//	@Test
//	public void test_getPercent() {
//		assertEquals(100.0, StudentMark.getPercent(100, 100, 100), 0.0f);
//	}
//	@Test(expected = ArithmeticException.class)
//	public void test_getPercentInvalidMarks() {
//		StudentMark.getPercent(1000, 1000, 1000);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}