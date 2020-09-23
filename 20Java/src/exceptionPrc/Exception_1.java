package exceptionPrc;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_1 {

	// args : Command Line Parameter (cmd창에서 쳐서 넘어오는 파라미터)
	public static void main(String[] args) {

		// unChecked Exception
		try {
			System.out.println(args[0] + ", 반가워!");
			System.out.println(args[1] + ", 반가워!");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
			e.printStackTrace();
			System.out.println("Usage : java Exception_1 이름 이름");
		}

		// unChecked Exception_2
		int num = 15;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			try {
				int x = (int) (Math.random() * 10);
				result = num / x;
				System.out.println((i + 1) + "회 : " + result);
			} catch (Exception e) {
				System.out.println("제수는 0이 될 수 없습니다.");
				i--;
			}
		}

		// Checked Exception_1
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("-------프로그램 정상종료----------");

		try {
			int x = System.in.read() - 48;
			switch (x) {
				case 1: {
					String str = null;
					str.length();
				}
				case 2: {
					int xx = 12 / 0;
				}
				case 3: {
					throw new FileNotFoundException("파일을 찾을 수 없습니다");
				}
				case 4: {
					throw new ClassNotFoundException("해당 클래스가 존재하지 않슺니다");
				}
				case 5: {
					throw new RuntimeException("프로그램 실행 중 에러 발생.");
				}
				case 6: {
					throw new BizRuntimeException("비즈니스 로직상에 에러 발생.");
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
