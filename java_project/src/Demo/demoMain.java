package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demoMain {
	public static void main(String[] args) throws IOException {
//		demo d = new demo(1, "naoejg");
//		demo d1 = new demo(3, "asrg");
//		
//		System.out.println(d.toString());
//		System.out.println(d1.toString());
//		
//		System.out.println(d1.toString1());
//		
	
	
		File myfile = new File("C:\\javafsd\\my_java_demos\\test.txt");
		FileInputStream fr = new FileInputStream(myfile);
		int i;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		
		}
		
	
	
	}
}
