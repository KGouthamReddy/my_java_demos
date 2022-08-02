package java_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\\\\\\\javafsd\\\\\\\\my_java_demos\\\\\\\\testfile.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String text;
		int count=0;
		while((text=br.readLine()) != null) {
			System.out.println(text);
			StringTokenizer st = new StringTokenizer(text);
			count += st.countTokens();
		}
		fr.close();
		br.close();
		System.out.println(count);
		
		
		String str = sc.next();
		
		byte[] b = str.getBytes();
		fr.write(b);
	}
	
}
