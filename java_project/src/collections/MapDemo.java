package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	static Map users = new HashMap<>();
	public static void main(String[] args) {
		users.put("estgetd", "aegh");
		users.put("123", "123");
		
		System.out.println(check("123", "1223"));
		
		Set<String> keys = users.keySet();
		System.out.println(keys);
		for(String key: keys) {
			System.out.println(key + " " + users.get(key));
		}
		Collection<String> values = users.values();
		System.out.println(values);
		
	}
	private static boolean check(String text, String pass) {
		// TODO Auto-generated method stub
		return users.get(text).equals(pass);
	}
	
	
}
