
public class SuperSonMain {

	public static void main(String[] args) {
		
		CheckingAccount check = new CheckingAccount("123-123-123", "�Ѹ�", 200000, "1234");
		
		//�θ�Ŭ������ �ʵ�� �޼��� ���.
		int money = check.withdraw(5000);
		System.out.println("����� �ݾ� : " + money);
		System.out.println("��    �� :" + check.balance);
		
		//�ڽ�Ŭ������ �ʵ�� �޼��� ���.
		money = check.pay("1234", 1000);
		System.out.println("����� �ݾ� : " + money);
		System.out.println("��    �� :" + check.balance);

	}

}
