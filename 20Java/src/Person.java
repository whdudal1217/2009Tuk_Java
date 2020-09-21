
public class Person {

	// ����ʵ�(=�������)
	String name;
	int age;
	char gender;
	String phone;

	// ������ : ��ü ����, ����ʵ� �ʱ�ȭ �۾�
	Person() {
	} // �⺻������
	
	//Person p = new Person("ȫ�浿", 18);
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Person p = new Person("ȫ�浿", 18, "m", "1234-1234");
	Person(String name, int age, char gender, String phone) {
		this(name, age); // name�� age�� �ʱ�ȭ�ϴ� ������(��)�� �����ϱ� ������ �ش� ������ ȣ��
		/*
		 * this.name = name; this.age = age; ���� ���⼭�� �ʱ�ȭ���� �ʾƵ� ��!
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
		p1.name = "ȫ�浿";
		p1.age = 18;
		p1.gender = 'M';
		
		System.out.println("p1 Name : " + p1.name);
		System.out.println("p1 Age : " + p1.age);
		System.out.println("p1 Gender : " + p1.gender);
		System.out.println("p1 Phone : " + p1.phone);
		System.out.println();
		
		Person p2 = new Person();
		p2.name = "��浿";
		
		System.out.println("p2 Name : " + p2.name);
		System.out.println("p2 Age : " + p2.age);
		System.out.println("p2 Gender : " + p2.gender);
		System.out.println("p2 Phone : " + p2.phone);
		System.out.println();
		
		Person p3 = new Person();
		
		p3.setName("�Ѹ�");
		p3.setAge(119);
		p3.setGender('M');
		p3.setPhone("����");
		
		System.out.println("p3 Name : " + p3.getName());
		System.out.println("p3 Age : " + p3.getAge());
		System.out.println("p3 Gender : " + p3.getGender());
		System.out.println("p3 Phone : " + p3.getPhone());
		System.out.println();
		
		Person p4 = new Person("�����", 14, 'F', "010-456-456");
		
		System.out.println("p4 Name : " + p4.getName());
		System.out.println("p4 Age : " + p4.getAge());
		System.out.println("p4 Gender : " + p4.getGender());
		System.out.println("p4 Phone : " + p4.getPhone());
		System.out.println();
		
	}

}















