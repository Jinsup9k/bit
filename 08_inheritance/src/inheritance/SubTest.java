package inheritance;

public class SubTest extends SuperTest {
	private String name;
	private int age;

	public SubTest() {
		System.out.println("SubTest �⺻ ������");
	}

	public SubTest(String name, int age, double weight, double height) {
		System.out.println("SubTest ������");
		this.name = name;
		this.age = age;
		super.weight = weight;
		super.height = height;
	}

	public void output() {
		System.out.println("�̸�  = " + name);
		System.out.println("����  = " + age);
		System.out.println("������  = " + weight);
		System.out.println("Ű  = " + height);
	}

	public static void main(String[] args) {
		SubTest st = new SubTest("ȫ�浿", 25, 79.5, 185.3);
		st.output();
		System.out.println("����");
		System.out.println();
		st.disp();// ������ ã�� ������ �θ����� ���� �ҷ���
		System.out.println();

		SuperTest bb = new SubTest("��ġ", 16, 52.3, 162.3);
		bb.disp();//output�� �ڽĲ��� �� �ҷ���
		
	}
}














