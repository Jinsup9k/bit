package class_2;



public class StaticTest {

//	class Test{
//		private int a;// �ν��Ͻ� ���� , �ʱ�ȭ
//		private static int b; // Ŭ���� ���� ,�ʱ�ȭ
//		String str;//
//	}
	private int a;
	private static int b;

	static {
		System.out.println("static �ʱ�ȭ ����");
	}

	public StaticTest() {
		System.out.println("�⺻ ������");
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
		//System.out.println("a= "+ a+"\t b"+b); ����ƽ���� �ȿ����� �Ϲ� �Լ� ��� �Ұ�
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
