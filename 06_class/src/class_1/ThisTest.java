package class_1;

class This {
	private String name;
	private int age;

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
		this.age = age;
	}

}

//---------------------------------------------------------
public class ThisTest {

	public static void main(String[] args) {
		This aa = new This();
		System.out.println(aa);
		aa.setName("ȫ�浿");
		aa.setAge(25);
		System.out.println("�̸� = " + aa.getName() + "\t ���� = " + aa.getAge());

		This bb = new This();
		System.out.println(bb);
		bb.setName("ȫ�浿");
		bb.setAge(25);
		System.out.println("�̸� = " + bb.getName() + "\t ���� = " + bb.getAge());

	}
}
