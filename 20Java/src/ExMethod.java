import java.util.Scanner;

public class ExMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 문장을 입력해주세요 : ");
		String str = sc.nextLine();
		printMsg(str);	
	}
	private static void printMsg(String string) {
		System.out.println(string);
	}
}
//String 타입의 매개변수를 가지는 printMsg 메서드 작성
//매개변수 내용 출력