package overridePrc;

public class SuperSonMain {

	public static void main(String[] args) {
		
		CheckingAccount check = new CheckingAccount("123-123-123", "�Ѹ�", 200000, "1234");
		
		//�θ�Ŭ������ �ʵ�� �޼��� ���.
		int money = check.withdraw(5000);
		System.out.println();
		System.out.println("����� �ݾ� : " + money); //195000
		System.out.println(check.ownerName + "���� "  +"��    �� :" + check.balance);
		
		//�ڽ�Ŭ������ �ʵ�� �޼��� ���.
		money = check.pay("1234", 1000);
		System.out.println();
		System.out.println("����� �ݾ� : " + money); //194000
		System.out.println( check.ownerName + "���� "  + "��    �� :" + check.balance);
		
		//�������̵�1
		CreditLineAccount cla = new CreditLineAccount("125-125-125", "ȣ����", 200000, 1000);
		//money = cla.withdraw(202000); //������ ���
		money = cla.withdraw(1000); //199000
		System.out.println();
		System.out.println("����� �ݾ� : " + money); 
		System.out.println(cla.ownerName+"���� "+"��   �� : " + cla.balance);
		
		//�������̵�2
		BonusPointAccount bpa = new BonusPointAccount("125-125-125", "�θ���ġŲ", 200000);
		int inMoney = 200000;
		bpa.deposite(inMoney); //400000
		System.out.println();
		System.out.println("�Աݵ� �ݾ� : " + inMoney); 
		System.out.println(bpa.ownerName+"���� "+"��   �� : " + bpa.balance);
		System.out.println(bpa.ownerName+"���� "+"�� �� �� : " + bpa.bonusPoint); //400000 * 0.001

	}

}
