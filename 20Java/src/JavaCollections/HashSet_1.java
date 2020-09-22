package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {
	public static void main(String[] args) {
		// set<String> set = new
		HashSet<String> set = new HashSet<String>();
		set.add(new String("유재석"));
		set.add("송지효");
		set.add(new String("김종국"));
		set.add("하동훈");
		boolean check = set.add(new String("김종국"));
		System.out.println("중복 체크 : " + check);

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
}
