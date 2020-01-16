package inheritance;

public class SubTest extends SuperTest {
	private String name;
	private int age;

	public SubTest() {
		System.out.println("SubTest 기본 생성자");
	}

	public SubTest(String name, int age, double weight, double height) {
		System.out.println("SubTest 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;
		super.height = height;
	}

	public void output() {
		System.out.println("이름  = " + name);
		System.out.println("나이  = " + age);
		System.out.println("몸무게  = " + weight);
		System.out.println("키  = " + height);
	}

	public static void main(String[] args) {
		SubTest st = new SubTest("홍길동", 25, 79.5, 185.3);
		st.output();
		System.out.println("졸려");
		System.out.println();
		st.disp();// 나부터 찾고 없으면 부모한테 가서 불러옴
		System.out.println();

		SuperTest bb = new SubTest("또치", 16, 52.3, 162.3);
		bb.disp();//output은 자식꺼라 못 불러옴
		
	}
}














