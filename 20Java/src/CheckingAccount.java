
public class CheckingAccount extends Account {

	String cardNo;
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); 
		
		this.cardNo = cardNo;
	}
	int pay(String cardNo, int amount) { 
		if(!this.cardNo.equals(cardNo)) {
			System.out.println("카드 번호가 잘못 되었습니다");
		}if(amount > balance) {
			System.out.println("�ܾ��� �����ϴ�");
			return 0;
		}
		balance -= amount;
		return withdraw(amount);
	}
}
