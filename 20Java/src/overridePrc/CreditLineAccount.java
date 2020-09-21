package overridePrc;

public class CreditLineAccount extends Account {
	
	int creditLine; //���̳ʽ� ���Ѽ�
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	@Override
	int withdraw(int amount) {
		if((balance + creditLine) < amount) {
			System.out.println("������ �Ұ����մϴ�.");
			return 0;
		}
		balance -= amount;
		return amount;
	}

}
