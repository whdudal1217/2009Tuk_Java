package overridePrc;

public class CheckingAccount extends Account {

	String cardNo;
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); //����Ŭ������ ������ ȣ��
		/* �θ�Ŭ����
		 * public Account(String accountNo, String ownerName, int balance)
		 */
		this.cardNo = cardNo;
	}
	int pay(String cardNo, int amount) { //amount : ���� �ݾ�
		if(!this.cardNo.equals(cardNo)) {
			System.out.println("카드 넘버가 맞지 않습니다");
		}if(amount > balance) {
			System.out.println("잔액이 부족합니다");
			return 0;
		}
		
		return balance -= amount;
	}
}
