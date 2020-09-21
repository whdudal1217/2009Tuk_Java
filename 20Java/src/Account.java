
public class Account {
	
	String accountNo; 
	String ownerName; 
	int balance; 

	// Account a = new Account();

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposite(int amount) {
		balance += amount;
	}

	int withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔액이 부족합니다");
			return 0;
		}
		balance -= amount;
		return amount;
	}

	public static void main(String[] args) {
		
		Account ac1 = new Account("123-1234-1234", "박진영", 200000);
		Account ac2 = new Account("345-3456-3456", "트와이스", 100000);
		
		int amount = ac1.withdraw(50000); //����
		ac2.deposite(amount); //�Ա�
		
		disp(ac1);
		disp(ac2);
	}

	public static void disp(Account ac) { 
		System.out.println("-*-*-*-*-*-*- 계 좌 정 보 -*-*-*-*-*-");
		System.out.println("계좌번호  : " + ac.accountNo);
		System.out.println("예금주 :  " + ac.ownerName);
		System.out.println(" 잔  액  : " + ac.balance);
		System.out.println();
	}
}
