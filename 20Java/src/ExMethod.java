import java.util.Scanner;

public class ExMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����ϰ� ���� ������ �Է����ּ��� : ");
		String str = sc.nextLine();
		printMsg(str);	
	}
	private static void printMsg(String string) {
		System.out.println(string);
	}
}
//String Ÿ���� �Ű������� ������ printMsg �޼��� �ۼ�
//�Ű����� ���� ���