package collection;

public class GenericTest<T> {
	private T a;

	public void setA(T a) {
		this.a = a;
	}

	public T getA() {
		return a;
	}

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();

		GenericTest<Integer> bb = new GenericTest<Integer>();

		aa.setA("Jinsu");
		bb.setA(25);

		System.out.println("�̸� : " + aa.getA() + "\n" + "���� : " + bb.getA());
	}
}
