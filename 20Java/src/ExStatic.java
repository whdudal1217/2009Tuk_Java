
class Accumulator{
	int total; //객체를 만들고 나서 메모리적재
	static int grandTotal; //클래스 로딩시 메모리적재
	
	//멤버 메소드 (인스턴스 메소드) 
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	//클래스 메소드 (Accumulator의 정적 메소드)
	static int getGrandTotal() {
		return grandTotal;
	}
}

public class ExStatic {
	
	public static void main(String[] args) {
		
		//정적 메소드는 객체 생성없이 클래스 이름만으로 접근
		System.out.println(Accumulator.getGrandTotal()); //0
		
		Accumulator acc1 = new Accumulator();
		Accumulator acc2 = new Accumulator();
		
		acc1.accumulate(100);
		acc2.accumulate(250);
		//System.out.println("acc.grandTotal : " + Accumulator.getGrandTotal()); //100+250
		
		System.out.println("acc1.total : " + acc1.total); //100
		System.out.println("acc1.grandTotal : " + Accumulator.grandTotal); //350
		
		System.out.println("acc2.total : " + acc2.total); //250
		System.out.println("acc2.grandTotal : " + Accumulator.grandTotal); //350
		
	}
}
