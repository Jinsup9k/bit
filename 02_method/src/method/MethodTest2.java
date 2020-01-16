package method;

public class MethodTest2 {
	public static void disp() {// ����
		System.out.println("static method");
	}

	public void output() {
		System.out.println("non- static method");
	}

	public static void main(String[] args) {
		// ȣ��
		// MethodTest2.disp();
		disp();

		// outputȣ��
		// 1ȸ�� new MethodTest2().output();

		// output�� �ּҰ��� �ҷ���
		MethodTest2 methodTest2 = new MethodTest2();
		System.out.println("methodTest2 = " + methodTest2);
		// �ּҰ��� 16������
		System.out.println("methodTest2 = " + methodTest2.toString());
		// �ּҰ��� 10������
		System.out.println("methodTest2 = " + methodTest2.hashCode());

		methodTest2.output(); // ȣ����
		System.out.println();

		int sum = methodTest2.plus(25, 36);
		int sub = methodTest2.minus(25, 36);
		int mul = methodTest2.multiply(25, 36);
		double div = methodTest2.divide(25, 36);

		System.out.println("25 + 36 = " + sum);
		System.out.println("25 - 36 = " + sub);
		System.out.println("25 * 36 = " + mul);
		System.out.println("25 / 36 = " + div);

	}

	public int plus(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		return (double)a / b;
	}
}
