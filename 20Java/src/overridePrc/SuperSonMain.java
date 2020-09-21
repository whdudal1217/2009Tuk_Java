package overridePrc;

public class SuperSonMain {

	public static void main(String[] args) {
		
		CheckingAccount check = new CheckingAccount("123-123-123", "둘리", 200000, "1234");
		
		//부모클래스의 필드와 메서드 사용.
		int money = check.withdraw(5000);
		System.out.println();
		System.out.println("인출된 금액 : " + money); //195000
		System.out.println(check.ownerName + "님의 "  +"잔    액 :" + check.balance);
		
		//자식클래스의 필드와 메서드 사용.
		money = check.pay("1234", 1000);
		System.out.println();
		System.out.println("인출된 금액 : " + money); //194000
		System.out.println( check.ownerName + "님의 "  + "잔    액 :" + check.balance);
		
		//오버라이드1
		CreditLineAccount cla = new CreditLineAccount("125-125-125", "호식이", 200000, 1000);
		//money = cla.withdraw(202000); //실패의 경우
		money = cla.withdraw(1000); //199000
		System.out.println();
		System.out.println("인출된 금액 : " + money); 
		System.out.println(cla.ownerName+"님의 "+"잔   액 : " + cla.balance);
		
		//오버라이드2
		BonusPointAccount bpa = new BonusPointAccount("125-125-125", "두마리치킨", 200000);
		int inMoney = 200000;
		bpa.deposite(inMoney); //400000
		System.out.println();
		System.out.println("입금된 금액 : " + inMoney); 
		System.out.println(bpa.ownerName+"님의 "+"잔   액 : " + bpa.balance);
		System.out.println(bpa.ownerName+"님의 "+"보 너 스 : " + bpa.bonusPoint); //400000 * 0.001

	}

}
