package JavaCollections;

import java.util.ArrayList;

public class ExMember {

	public static void main(String[] args) {
		
		ArrayList<Member> memList = new ArrayList<Member>();
		
		for (int i = 0; i < 10; i++) {
			Member member = new Member();
			member.setMemId("Id" + i);
			member.setMemPwd("pwd" + i);
			member.setMemName("name" + i);
			member.setMemGender("gender" + i);
			member.setMemEmail("email" + i);
			member.setMemPhone("phone" + i);
			memList.add(member);
		}
		
		for (int i = 0; i < memList.size(); i++) {
			Member member = memList.get(i);
			System.out.println(i + "번째");
			System.out.println("id" + member.getMemId());
			System.out.println("pwd" + member.getMemPwd());
			System.out.println("name" + member.getMemName());
			System.out.println("gender" + member.getMemGender());
			System.out.println("email" + member.getMemEmail());
			System.out.println("phone" + member.getMemPhone());
			System.out.println("---------------------");
		}
	}
}
