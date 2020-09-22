package interfacePrc;

public class InterfaceMain {

	public static void main(String[] args) {
		//AppCDInfo cd = new AppCDInfo("1", "아기공룡둘리");
		//SeparateVolume sv = new SeparateVolume("조영미", "200922");
		Lendable [] lendList = {
				//빌리고 싶은 책 리스트
				new SeparateVolume("789-95", "이것이 자바다" , "신용권"), 
				new AppCDInfo("가-5678", "리눅스 서버 설치 CD"),
				new SeparateVolume("987-65", "이것이 아빠다" , "신병만"),
				new AppCDInfo("나-1234", "유닉스 서버 설치 CD")
		};
		//빌릴 사람
		checkOutAll(lendList, "주몽" , "2020-09-22");
	}

	private static void checkOutAll(Lendable[] lendList, String borrower, String date) {
		for (int i = 0; i < lendList.length; i++) {
			lendList[i].checkOut(borrower, date);
		}
	}

}
