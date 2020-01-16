package constructor;

class ConstructorTest {
	private String name;
	private int age;

	// �������� ���� : ��ü �ʱ�ȭ
	public ConstructorTest() {
		System.out.println("�⺻ ������");
	}

	public ConstructorTest(String name) {
		this();//Overload �� �ٸ� �����ڸ� ȣ��
		this.name = name;
	}

	public ConstructorTest(int age) {
		this("��������������");//�����ڳ��� ���� ȣ�� ���� �ݵ�� ù°�ٿ� ȣ�� ����
		this.age = age;
	}// ������ Overload

	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

//
public class ConstructorMain {
	public static void main(String[] args) {
		ConstructorTest c = new ConstructorTest();

		System.out.println(c.getName() + "\t" + c.getAge());
		System.out.println();

		ConstructorTest cc = new ConstructorTest("������");
		System.out.println(cc.getName());
		System.out.println();

		ConstructorTest ccc = new ConstructorTest(25);
		System.out.println(ccc.getAge());
		System.out.println();

	}
}
