package JavaCollections;

import java.util.*;

public class HashMap_1 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("id", "Chayeon");
		map.put("name", "정채연");
		map.put("age", 25);
		map.put("phone", "010-1111-2222");
		map.put("name", "이채연");

		System.out.println(" *-*-* 맵에 대한 키 접근 *-*-*");
		System.out.println("name : " + map.get("name"));
		System.out.println("age : " + map.get("age"));
		System.out.println("phone : " + map.get("phone"));
		System.out.println();
		System.out.println(" *-*-* 맵에 대한 순차 접근 *-*-*");
		Set<String> keyset = map.keySet();
		Iterator<String> itr = keyset.iterator();

		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println(key + " = " + map.get(key));

		}
		
		System.out.println();
		if (map.containsKey("name")) {
			System.out.println("name : " + map.containsKey("name"));
			System.out.println("name2 : " + map.containsKey("name2"));
		}
	}

}

//이터레이터는 ㄴ도대체 어떻게 생긴거지?