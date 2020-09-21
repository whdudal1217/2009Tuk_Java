
class Calcul {

	int plus(int x, int y) {
		return x + y;
	}

	int plus(int x, int y, int z) {
		return x + y + z;
	}

	float plus(float x, float y) {
		return x + y;
	}

	int minus(int x, int y) {
		return x - y;
	}

	int multiple(int x, int y) {
		return x * y;
	}

	float divide(float x, float y) {
		return x / y;
	}

}

public class Overload {
	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		
		Calcul calc = new Calcul();
		int c = calc.plus(a, b);
		System.out.println("c(calc.plus(int, int)) : " + c);
		
		float x = 3.14f;
		float y = 1.25f;
		float z = calc.plus(x, y);
		System.out.println("z(calc.plus(float, float)) : " + z);
		//이름은 같으나 매개변수가 다름 오버로딩
	}
}
