package inheritance;

public class ChildTest extends SuperTest {
	private String name;
	private int age;

	public ChildTest() {
		System.out.println("ChildTest �⺻ ������");
	}

	public ChildTest(String name, int age, double weight, double height) {
		super(weight,height);//�θ������ ȣ�� this()�� ���������� �ݵ�� ù��° ��
		System.out.println("ChildTest ������");
		this.name = name;
		this.age = age;
		//super.weight = weight;
		//super.height = height;
	}

	public void disp() {
		System.out.println("�̸�  = " + name);
		System.out.println("����  = " + age);
		System.out.println("������  = " + weight);
		System.out.println("Ű  = " + height);
	}

	public static void main(String[] args) {
		ChildTest aa = new ChildTest("ȫ�浿", 25, 79.5, 185.3);
		aa.disp();
		System.out.println();
		
		SuperTest bb = new ChildTest("��ġ", 16, 52.3, 162.3);
		bb.disp();// Override�� ��쿣 �켱���� �ڽ��� �� ����.
	}
}










