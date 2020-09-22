package JavaCollections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String,String> htable = new Hashtable<String, String>();
		
		htable.put("가람이", "010-1111-1111");
		htable.put("나람이", "010-2222-2222");
		htable.put("다람이", "010-3333-3333");
		System.out.println("나람이 : " + htable.get("나람이"));
		
		System.out.println("\n -*-*-* Enumeration *-*-*- \n");
		
		htable.keySet();
		Enumeration<String> keyEnum = htable.keys();
		while (keyEnum.hasMoreElements()) {
			String keys = (String) keyEnum.nextElement();
			System.out.println(keys + " : " + htable.get(keys));
			
		}

	}

}
