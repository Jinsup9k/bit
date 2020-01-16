package class_2;



public class StaticTest {

//	class Test{
//		private int a;// 인스턴스 변수 , 초기화
//		private static int b; // 클래스 변수 ,초기화
//		String str;//
//	}
	private int a;
	private static int b;

	static {
		System.out.println("static 초기화 영역");
	}

	public StaticTest() {
		System.out.println("기본 생성자");
		a = 3;
	}

	public void calc() {
		a++;
		b++;
	}

	public void disp() {
		System.out.println("a= " + this.a + "\t b=" + b);
	}
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a= "+ a+"\t b"+b); 스태틱변수 안에서는 일반 함수 사용 불가
	}
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();

		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();

		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();

		StaticTest.output();
		output();
		st.output();
	}
}
