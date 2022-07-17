package project_test;

import java.io.FileOutputStream;

public class files {
	public static void main(String a[]) {
		try{
			FileOutputStream f1 = new FileOutputStream("C:\\javafsd\\my_java_demos\\testfile.txt");

			String text = "Welcome to Jurassic World! This is Alen and i wil be your assit of the day.";
			byte[] b = text.getBytes();
			f1.write(b);
			f1.close();
			System.out.println("Tourist is successfully assigned for the BATCH - 19");
		}catch(Exception e) {
			System.out.println("We are solving the problem at Ground level - 4");
		}
	}

}
