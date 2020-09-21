
public class Person {

	// 멤버필드(=멤버변수)
	String name;
	int age;
	char gender;
	String phone;

	// 생성자 : 객체 생성, 멤버필드 초기화 작업
	Person() {
	} // 기본생성자
	
	//Person p = new Person("홍길동", 18);
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Person p = new Person("홍길동", 18, "m", "1234-1234");
	Person(String name, int age, char gender, String phone) {
		this(name, age); // name과 age를 초기화하는 생성자(↑)가 존재하기 때문에 해당 생성자 호출
		/*
		 * this.name = name; this.age = age; 굳이 여기서도 초기화하지 않아도 됨!
		 */
		this.gender = gender;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if(age<0 || age >120) {
			age = 0;
		}
		
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 18;
		p1.gender = 'M';
		
		System.out.println("p1 Name : " + p1.name);
		System.out.println("p1 Age : " + p1.age);
		System.out.println("p1 Gender : " + p1.gender);
		System.out.println("p1 Phone : " + p1.phone);
		System.out.println();
		
		Person p2 = new Person();
		p2.name = "고길동";
		
		System.out.println("p2 Name : " + p2.name);
		System.out.println("p2 Age : " + p2.age);
		System.out.println("p2 Gender : " + p2.gender);
		System.out.println("p2 Phone : " + p2.phone);
		System.out.println();
		
		Person p3 = new Person();
		
		p3.setName("둘리");
		p3.setAge(119);
		p3.setGender('M');
		p3.setPhone("없음");
		
		System.out.println("p3 Name : " + p3.getName());
		System.out.println("p3 Age : " + p3.getAge());
		System.out.println("p3 Gender : " + p3.getGender());
		System.out.println("p3 Phone : " + p3.getPhone());
		System.out.println();
		
		Person p4 = new Person("도우너", 14, 'F', "010-456-456");
		
		System.out.println("p4 Name : " + p4.getName());
		System.out.println("p4 Age : " + p4.getAge());
		System.out.println("p4 Gender : " + p4.getGender());
		System.out.println("p4 Phone : " + p4.getPhone());
		System.out.println();
		
	}

}















