package constructor;

class ConstructorTest {
	private String name;
	private int age;

	// 생성자의 목적 : 객체 초기화
	public ConstructorTest() {
		System.out.println("기본 생성자");
	}

	public ConstructorTest(String name) {
		this();//Overload 된 다른 생성자를 호출
		this.name = name;
	}

	public ConstructorTest(int age) {
		this("박진수진수진수");//생성자끼린 서로 호출 가능 반드시 첫째줄에 호출 가능
		this.age = age;
	}// 생성자 Overload

	
	
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

		ConstructorTest cc = new ConstructorTest("박진수");
		System.out.println(cc.getName());
		System.out.println();

		ConstructorTest ccc = new ConstructorTest(25);
		System.out.println(ccc.getAge());
		System.out.println();

	}
}
