package overridePrc;

public class Account {
	
	String accountNo; //계좌번호
	String ownerName; //예금주
	int balance; //잔액

	// Account a = new Account(); -> 기본생성자 만들어주면 사용됨

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//입금
	void deposite(int amount) {
		balance += amount;
	}

	//출금
	int withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= amount;
		return amount;
	}

	public static void main(String[] args) {
		
		Account ac1 = new Account("123-1234-1234", "홍길동", 200000);
		Account ac2 = new Account("345-3456-3456", "고길동", 100000);
		
		int amount = ac1.withdraw(50000); //인출
		ac2.deposite(amount); //입금
		
		disp(ac1);
		disp(ac2);
	}

	public static void disp(Account ac) { //ac1의 주소가 전달되고 이 메소드 종료시 메모리 해제하고 ac2를 메모리에 올림
		System.out.println("-*-*-*-*-*-*- 계좌정보 -*-*-*-*-*-");
		System.out.println("계좌번호  : " + ac.accountNo);
		System.out.println("예 금 주 :  " + ac.ownerName);
		System.out.println("잔 액    : " + ac.balance);
		System.out.println();
	}
}
