package JavaCollections;

import java.util.*;

public class Vector_1 {
	public static void main(String[] args) {
		//<T> 제너릭 설정 안 해주면 모든 타입을 저장할 수 있음
		Vector vec = new Vector();
		vec.add("문자");
		vec.add(1234);
		vec.add(12.34);
		
		for (int i = 0; i < vec.size(); i++) {
			Object obj = vec.get(i);
			System.out.println("Vector(" + i + ")" + obj + "\t\t type : " + obj.getClass());
		}
	}
}
