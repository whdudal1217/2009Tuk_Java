
class Accumulator{
	int total; //��ü�� ����� ���� �޸�����
	static int grandTotal; //Ŭ���� �ε��� �޸�����
	
	//��� �޼ҵ� (�ν��Ͻ� �޼ҵ�) 
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	//Ŭ���� �޼ҵ� (Accumulator�� ���� �޼ҵ�)
	static int getGrandTotal() {
		return grandTotal;
	}
}

public class ExStatic {
	
	public static void main(String[] args) {
		
		//���� �޼ҵ�� ��ü �������� Ŭ���� �̸������� ����
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
