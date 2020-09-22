package overridePrc;

public class Polymorphism {

	public static void main(String[] args) {
		
		Account acc = new Account("123", "박진영", 20000);
		
		//upcasting
		Account check = new CheckingAccount("456", "트와이스", 30000, "456"); 
		//Account클래스 안의 것만 사용 가능
		
		CreditLineAccount minus = new CreditLineAccount("567", "원더걸스", 50000, 30000);
		
		BonusPointAccount bonus = new BonusPointAccount("8910" , "미스에이", 70000);
		
		disp(acc);
		disp(check);
		disp(minus);
		disp(bonus);
	}
	public static void disp(Account acc) { //ac1의 주소가 전달되고 이 메소드 종료시 메모리 해제하고 ac2를 메모리에 올림
		System.out.println("-*-*-*-*-*-*- 계좌정보 -*-*-*-*-*-");
		System.out.println("계좌번호  : " + acc.accountNo);
		System.out.println("예 금 주 :  " + acc.ownerName);
		System.out.println("잔 액    : " + acc.balance);
		System.out.println();
		
		if(acc instanceof BonusPointAccount) { 
			//instanceof : acc가 BonusPointAccount의 인스턴스와 같은지, 지금 Account 타입으로 넘어와서 맞는게 없음
			//DownCasting
			//위에서 ﻿BonusPointAccount 타입으로 선언했기 때문에 bonus 사용 가능
			BonusPointAccount bonus = (BonusPointAccount) acc;
			System.out.println("포 인 트 :" + bonus.bonusPoint);
		}else if(acc instanceof CheckingAccount) {
			CheckingAccount checkAccount = (CheckingAccount) acc;
			checkAccount.pay("123", 1000);
		}
		System.out.println();
	}

}
