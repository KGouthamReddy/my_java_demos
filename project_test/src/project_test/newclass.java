package project_test;

public class newclass {
	public static void main(String args[]) {
		System.out.println("hello");
		
		char[] c = {'a', 'v', 'd'};
		String sc = new String(c);
		
		byte[] b = {112,124,65};
		
		String sb = new String(b);
		
		String b1 = new String(sc);
		
		System.out.println(sc);
		System.out.println(b1);
		
		String name = "Alen is my name";
		char[] ch = name.toCharArray();
//		System.out.print(n);
		
		String str = new String();
		str = "my name GDTYUFFYJUF";
		
		char[] newstr = str.toCharArray();
//		
//		for(char i : newstr) {
//			 System.out.println(i);
//		}
		
//		for(int i=0; i<name.length(); i++) {
//			System.out.println(ch[i]);
//		}
//		
		//String[] splitting = str.split(" ");
		System.out.println(str.indexOf("F"));
		
		
	}

}
