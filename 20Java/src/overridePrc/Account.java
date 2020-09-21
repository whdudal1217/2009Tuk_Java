package overridePrc;

public class Account {
	
	String accountNo; //���¹�ȣ
	String ownerName; //������
	int balance; //�ܾ�

	// Account a = new Account(); -> �⺻������ ������ָ� ����

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//�Ա�
	void deposite(int amount) {
		balance += amount;
	}

	//���
	int withdraw(int amount) {
		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		balance -= amount;
		return amount;
	}

	public static void main(String[] args) {
		
		Account ac1 = new Account("123-1234-1234", "ȫ�浿", 200000);
		Account ac2 = new Account("345-3456-3456", "��浿", 100000);
		
		int amount = ac1.withdraw(50000); //����
		ac2.deposite(amount); //�Ա�
		
		disp(ac1);
		disp(ac2);
	}

	public static void disp(Account ac) { //ac1�� �ּҰ� ���޵ǰ� �� �޼ҵ� ����� �޸� �����ϰ� ac2�� �޸𸮿� �ø�
		System.out.println("-*-*-*-*-*-*- �������� -*-*-*-*-*-");
		System.out.println("���¹�ȣ  : " + ac.accountNo);
		System.out.println("�� �� �� :  " + ac.ownerName);
		System.out.println("�� ��    : " + ac.balance);
		System.out.println();
	}
}
