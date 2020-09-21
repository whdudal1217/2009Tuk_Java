
public class SuperSonMain {

	public static void main(String[] args) {
		
		CheckingAccount check = new CheckingAccount("123-123-123", "둘리", 200000, "1234");
		
		//부모클래스의 필드와 메서드 사용.
		int money = check.withdraw(5000);
		System.out.println("인출된 금액 : " + money);
		System.out.println("잔    액 :" + check.balance);
		
		//자식클래스의 필드와 메서드 사용.
		money = check.pay("1234", 1000);
		System.out.println("인출된 금액 : " + money);
		System.out.println("잔    액 :" + check.balance);

	}

}
