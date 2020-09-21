package overridePrc;

public class BonusPointAccount extends Account{

	int bonusPoint;
	public BonusPointAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
	}
	@Override
	void deposite(int amount) {
		balance += amount;
		bonusPoint += (int)(amount*0.001);
	}
	
}
