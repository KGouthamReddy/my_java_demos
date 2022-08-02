package java_project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class files {
	public static void main(String a[]) throws IOException{
		
		FileOutputStream fout= new FileOutputStream("C:\\\\javafsd\\\\my_java_demos\\\\testfile.txt");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the note to the file: ");
		String note = sc.nextLine();
		byte[] b = note.getBytes();
		fout.write(b);
		
		System.out.println("File was successfully updated");
//		
		FileReader fr = new FileReader("C:\\\\\\\\javafsd\\\\\\\\my_java_demos\\\\\\\\testfile.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String text;
		int count=0;
		while((text=br.readLine()) != null) {
			System.out.println(text);
		}
		
//		FileReader fr = new FileReader("C:\\\\\\\\javafsd\\\\\\\\my_java_demos\\\\\\\\dEMo1.txt");
//		FileWriter fw = new FileWriter("C:\\\\\\\\javafsd\\\\\\\\my_java_demos\\\\\\\\demo2.txt");
		
//		int ch;
//		while((ch = fr.read()) != -1) {
//			fw.write(ch);
//		}
//		fr.close();
//		fw.close();
		
	}

}
