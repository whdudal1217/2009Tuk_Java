package overridePrc;

public class CreditLineAccount extends Account {
	
	int creditLine; //마이너스 상한선
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	@Override
	int withdraw(int amount) {
		if((balance + creditLine) < amount) {
			System.out.println("인출이 불가능합니다.");
			return 0;
		}
		balance -= amount;
		return amount;
	}

}
