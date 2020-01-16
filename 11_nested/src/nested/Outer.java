package nested;

import nested.Outer.Inner;

public class Outer {// Outer�� Inner�� �������� ����(��ü�� �����ϸ� ���� ����)
	private String name;

	public void output() {
		Inner i = new Inner();
		System.out.println("�̸� = " + name + "���� = " + i.age);
	}

	class Inner {// Inner�� Outer�� ����� ���� ����
		private int age;

		public void disp() {
			System.out.println("�̸� = " + Outer.this.name + " " + "���� = " + age);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.name = "ȫ�浿";
		System.out.println("�̸� = " + outer.name);

		Outer.Inner inner = outer.new Inner();
		inner.age = 25;
		inner.disp();

		Outer.Inner inner2 = outer.new Inner();
		outer.name = "�ڳ�";
		inner2.age = 30;
		inner2.disp();

		Outer.Inner inner3 = new Outer().new Inner();
		// inner3.name = "��ġ"; ���� - static�� ���ļ� ���ͼ� ����
		inner3.age = 35;
		inner3.disp();
	}
}
