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
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println("이름 = " + aa.getName() + "\t 나이 = " + aa.getAge());

		This bb = new This();
		System.out.println(bb);
		bb.setName("홍길동");
		bb.setAge(25);
		System.out.println("이름 = " + bb.getName() + "\t 나이 = " + bb.getAge());

	}
}
